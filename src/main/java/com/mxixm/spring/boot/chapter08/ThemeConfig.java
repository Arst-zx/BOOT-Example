package com.mxixm.spring.boot.chapter08;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ThemeResolver;
import org.springframework.web.servlet.theme.SessionThemeResolver;

/**
 * @author 章鑫
 */
public class ThemeConfig {

    @Bean
    public ThemeResolver themeResolver() {
        return new SessionThemeResolver();
    }

}
