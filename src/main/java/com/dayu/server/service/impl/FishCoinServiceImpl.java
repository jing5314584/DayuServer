package com.dayu.server.service.impl;

import com.dayu.server.mbg.mapper.V_UserFishcoinLogMapper;
import com.dayu.server.mbg.model.V_UserFishcoinLog;
import com.dayu.server.mbg.model.V_UserFishcoinLogExample;
import com.dayu.server.service.FishCoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FishCoinServiceImpl implements FishCoinService {
    @Autowired
    private V_UserFishcoinLogMapper v_userFishcoinLogMapper;
    @Override
    public List<V_UserFishcoinLog> getUserFishcoinLogListByUserId(int userIdx) {
        V_UserFishcoinLogExample example=new V_UserFishcoinLogExample();
        example.createCriteria().andIdxEqualTo(userIdx);
        example.setOrderByClause("create_time desc");
        List<V_UserFishcoinLog> fishCoinLogList = v_userFishcoinLogMapper.selectByExample(example);
        return fishCoinLogList;
    }
}
