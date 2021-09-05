package com.gaotong.smart.config;


import com.baomidou.mybatisplus.core.injector.ISqlInjector;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.gaotong.smart.mapper")
public class NewsConfig {
//    @Bean
//
//    public ISqlInjector sqlInjector() {
//
//        return new LogicSqlInjector();
//
//    }
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
