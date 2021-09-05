//package com.gaotong.smart.config;
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
//@Configuration
//@Component
//public class MyWebConfig implements WebMvcConfigurer {
//    @Value("${localFileUrl}")
//    private String localPath;//本地存放的文件路径 例如:E:\down
//    @Value("${mappingFileUrl}")
//    private String mappingPath;//映射的虚拟网络地址  供页面连接访问的url
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//
//        registry.addResourceHandler(mappingPath+"**").addResourceLocations("file:"+localPath+"/");
//    }
//
//
//}