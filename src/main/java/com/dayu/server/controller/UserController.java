package com.dayu.server.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dayu.server.common.CommonResult;
import com.dayu.server.common.ResultCode;
import com.dayu.server.common.WechatUtil;
import com.dayu.server.mbg.model.User;
import com.dayu.server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("api/")
public class UserController {
    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(getClass());
    @PostMapping("userlist")
    @ResponseBody
    public CommonResult<List<User>> GetUserList(@RequestParam(value = "user", required = false) String user){
        List<User> userList = userService.listUser(1,20);
        return CommonResult.success(userList);
    }
    @PostMapping("userLogin")
    @ResponseBody
    public CommonResult userLogin(@RequestParam(value = "code", required = false) String code,
                                          @RequestParam(value = "rawData", required = false) String rawData,
                                          @RequestParam(value = "signature", required = false) String signature,
                                          @RequestParam(value = "encrypteData", required = false) String encrypteData,
                                          @RequestParam(value = "iv", required = false) String iv){
        // 用户非敏感信息：rawData
        // 签名：signature
        JSONObject rawDataJson = JSON.parseObject(rawData);
        // 1.接收小程序发送的code
        // 2.开发者服务器 登录凭证校验接口 appi + appsecret + code
        JSONObject SessionKeyOpenId = WechatUtil.getSessionKeyOrOpenId(code);
        // 3.接收微信接口服务 获取返回的参数
        String openid = SessionKeyOpenId.getString("openid");
        String sessionKey = SessionKeyOpenId.getString("session_key");

        // 4.校验签名 小程序发送的签名signature与服务器端生成的签名signature2 = sha1(rawData + sessionKey)
        String signature2 = DigestUtils.sha1Hex(rawData + sessionKey);
        if (!signature.equals(signature2)) {
            return CommonResult.failed(ResultCode.VALIDATE_FAILED,"签名校验失败");
        }
        // 5.根据返回的User实体类，判断用户是否是新用户，是的话，将用户信息存到数据库；不是的话，更新最新登录时间
        User user = userService.insertUser(rawDataJson,openid,sessionKey);
        //encrypteData比rowData多了appid和openid
       // JSONObject userInfo = WechatUtil.getUserInfo(encrypteData, sessionKey, iv);
        //6. 把新的skey返回给小程序

        return CommonResult.success(user);
    }
}
