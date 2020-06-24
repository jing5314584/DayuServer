package com.dayu.server.controller;

import com.dayu.server.common.CommonResult;
import com.dayu.server.mbg.model.User;
import com.dayu.server.mbg.model.V_UserFishcoinLog;
import com.dayu.server.service.FishCoinService;
import com.dayu.server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("api/")
public class FishCoinController {
    @Autowired
    private FishCoinService fishCoinService;
    private Logger logger = LoggerFactory.getLogger(getClass());
    @PostMapping("fishcoinLogList")
    @ResponseBody
    public CommonResult<List<V_UserFishcoinLog>> GetUserList(@RequestParam(value = "userId", required = false) int userId){
        if (userId <= 0){
            return CommonResult.failed();
        }
        List<V_UserFishcoinLog> fishcoinLogList = fishCoinService.getUserFishcoinLogListByUserId(userId);
        return CommonResult.success(fishcoinLogList);
    }
}
