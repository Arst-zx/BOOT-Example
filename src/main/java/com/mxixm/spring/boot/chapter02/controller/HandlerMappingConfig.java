package com.mxixm.spring.boot.chapter02.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import java.util.Collections;

/**
 * @author 章鑫
 * 声明为 Spring 的配置类
 */
@Configuration
public class HandlerMappingConfig {

    /**
     * 声明为 Spring 的 Bean
     * @return
     */
    @Bean
    public SimpleServletHandlerAdapter simpleServletHandlerAdapter() {
        return new SimpleServletHandlerAdapter();
    }

    @Bean
    public SimpleUrlHandlerMapping MyHttpRequestHandler() {

        /**
         * 创建实例
         */
        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();

        /**
         * 设置高优先
         */
        mapping.setOrder(Ordered.HIGHEST_PRECEDENCE);

        /**
         * 设置 URL 与 Handler 的映射关系，通过 HttpRequestHandler 处理请求
         */
        mapping.setUrlMap(Collections.singletonMap("httpRequestHandler",
                new MyHttpRequestHandler()));
        return mapping;
    }

}
