package com.dayu.server.mbg.mapper;

import com.dayu.server.mbg.model.V_UserFishcoinLog;
import com.dayu.server.mbg.model.V_UserFishcoinLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface V_UserFishcoinLogMapper {
    long countByExample(V_UserFishcoinLogExample example);

    int deleteByExample(V_UserFishcoinLogExample example);

    int insert(V_UserFishcoinLog record);

    int insertSelective(V_UserFishcoinLog record);

    List<V_UserFishcoinLog> selectByExample(V_UserFishcoinLogExample example);

    int updateByExampleSelective(@Param("record") V_UserFishcoinLog record, @Param("example") V_UserFishcoinLogExample example);

    int updateByExample(@Param("record") V_UserFishcoinLog record, @Param("example") V_UserFishcoinLogExample example);
}