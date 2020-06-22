package com.dayu.server.service;


import com.alibaba.fastjson.JSONObject;
import com.dayu.server.mbg.model.User;

import java.util.List;

public interface UserService {

    List<User> listUser(int pageNum, int pageSize);

    User insertUser(JSONObject rawDataJson, String openid, String sessionKey);
}
