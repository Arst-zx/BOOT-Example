package com.mxixm.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 章鑫
 * 声明为 Spring Boot 应用，项目以此类为基础进行配置
 */
@SpringBootApplication
public class Starter {

    /**
     * Java main 方法，启动入口，启动此 main 方法即可启动 Web 项目
     */
    public static void main(String[] args) {

        /**
         * 传入本类，作为配置类
         */
        SpringApplication.run(Starter.class);
    }

}
