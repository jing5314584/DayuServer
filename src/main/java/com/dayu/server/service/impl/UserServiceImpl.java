package com.dayu.server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dayu.server.mbg.mapper.UserMapper;
import com.dayu.server.mbg.mapper.UserOauthMapper;
import com.dayu.server.mbg.model.User;
import com.dayu.server.mbg.model.UserExample;
import com.dayu.server.mbg.model.UserOauth;
import com.dayu.server.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserOauthMapper userOauthMapper;
    @Override
    public List<User> listUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public  User insertUser(JSONObject rawDataJson, String openid, String sessionKey){
        UserOauth userOauth = userOauthMapper.selectByPrimaryKey(openid);
        if (userOauth == null){
            // 用户信息入库
            String nickName = rawDataJson.getString("nickName");
            String avatarUrl = rawDataJson.getString("avatarUrl");
            String gender = rawDataJson.getString("gender");
            String city = rawDataJson.getString("city");
            String country = rawDataJson.getString("country");
            String province = rawDataJson.getString("province");
            userOauth.setOpenId(openid);
            userOauth.setCreateTime(new Date());
            userOauth.setLastVisitTime(new Date());
            userOauth.setSessionKey(sessionKey);
            userOauth.setCity(city);
            userOauth.setProvince(province);
            userOauth.setCountry(country);
            userOauth.setAvatarUrl(avatarUrl);
            userOauth.setGender((byte) Integer.parseInt(gender));
            userOauth.setNickName(nickName);
            userOauthMapper.insert(userOauth);
        }else {
            // 已存在，更新用户登录时间
            userOauth.setLastVisitTime(new Date());
            this.userOauthMapper.updateByPrimaryKey(userOauth);
        }
        User user = userMapper.selectByPrimaryKey(userOauth.getUserIdx());
        return user;
    }
}
