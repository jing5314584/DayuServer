package com.dayu.server.mbg.mapper;

import com.dayu.server.mbg.model.UserOauth;
import com.dayu.server.mbg.model.UserOauthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOauthMapper {
    long countByExample(UserOauthExample example);

    int deleteByExample(UserOauthExample example);

    int deleteByPrimaryKey(String openId);

    int insert(UserOauth record);

    int insertSelective(UserOauth record);

    List<UserOauth> selectByExample(UserOauthExample example);

    UserOauth selectByPrimaryKey(String openId);

    int updateByExampleSelective(@Param("record") UserOauth record, @Param("example") UserOauthExample example);

    int updateByExample(@Param("record") UserOauth record, @Param("example") UserOauthExample example);

    int updateByPrimaryKeySelective(UserOauth record);

    int updateByPrimaryKey(UserOauth record);
}