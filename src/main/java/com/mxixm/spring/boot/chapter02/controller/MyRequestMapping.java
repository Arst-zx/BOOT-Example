package com.mxixm.spring.boot.chapter02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Map;

/**
 * 声明为 Controller 控制器 Bean，该 Bean 中被注解 @RequestMapping 标记的方法会被 RequestMappingHandlerMapping 扫描并包装为 HandlerMethod
 * @author 章鑫
 */
@Controller
public class MyRequestMapping {

    /**
     * 映射 URL 为 /myRequestMapping，支持 GET 类型的请求
     * @param name
     * @param model
     * @return String
     */
    @RequestMapping(path = "/myRequestMapping", method = RequestMethod.GET)
    public String requestMappingGet(String name, Map<String, Object> model) {

        /**
         * name参数可以从请求参数中自动获取并绑定，model参数也会自动作为Model模型绑定到参数中
         */
        model.put("name", name);

        /**
         * 返回视图名，同上面例子
         */
        return "defaultView";
    }

    @RequestMapping(path = "/myRequestMapping", method = RequestMethod.POST)
    public String requestMappingPost(Map<String, Object> model) {

        /**
         * name参数可以从请求参数中自动获取并绑定，model参数也会自动作为Model模型绑定到参数中
         */
        model.put("name", "POST请求");

        /**
         * 返回视图名，同上面例子
         */
        return "defaultView";
    }

}