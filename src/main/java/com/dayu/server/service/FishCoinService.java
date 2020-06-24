package com.dayu.server.service;

import com.dayu.server.mbg.model.V_UserFishcoinLog;

import java.util.List;

public interface FishCoinService {
    List<V_UserFishcoinLog> getUserFishcoinLogListByUserId(int userIdx);
}
