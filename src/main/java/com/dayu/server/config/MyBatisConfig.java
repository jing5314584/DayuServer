package com.dayu.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.dayu.server.mbg.mapper","com.dayu.server.mbg.model","com.dayu.server.mbg.xml"})
public class MyBatisConfig {
}
