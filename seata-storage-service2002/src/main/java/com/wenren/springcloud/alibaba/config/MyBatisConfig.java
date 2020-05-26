package com.wenren.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-25-14:43
 */
@Configuration
@MapperScan({"com.wenren.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
