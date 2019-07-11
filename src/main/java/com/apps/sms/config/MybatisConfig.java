package com.apps.sms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.apps.sms.dao")
public class MybatisConfig {
 
}
