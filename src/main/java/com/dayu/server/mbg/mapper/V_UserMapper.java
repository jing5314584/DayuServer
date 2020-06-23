package com.dayu.server.mbg.mapper;

import com.dayu.server.mbg.model.V_User;
import com.dayu.server.mbg.model.V_UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface V_UserMapper {
    long countByExample(V_UserExample example);

    int deleteByExample(V_UserExample example);

    int insert(V_User record);

    int insertSelective(V_User record);

    List<V_User> selectByExample(V_UserExample example);

    int updateByExampleSelective(@Param("record") V_User record, @Param("example") V_UserExample example);

    int updateByExample(@Param("record") V_User record, @Param("example") V_UserExample example);
}