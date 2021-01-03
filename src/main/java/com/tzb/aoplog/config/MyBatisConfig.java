package com.tzb.aoplog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create by zhatang on 2020/12/30.
 */
@Configuration
@MapperScan("com.tzb.aoplog.mbg.mapper")
public class MyBatisConfig {
}
