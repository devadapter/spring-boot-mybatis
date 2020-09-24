package com.devadapter.springbootmybatis.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zhangjie
 * @date 2019-05-10 10:10:00
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    BrowseItemInterceptor browseItemInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(browseItemInterceptor).addPathPatterns("/**");
    }
}
