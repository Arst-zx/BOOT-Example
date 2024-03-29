package com.mxixm.spring.boot.controller;

import com.mxixm.spring.boot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 章鑫
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/")
    public String index(Model model) {
        String name = demoService.getName(1);
        model.addAttribute("name", name);
        return "index";
    }

}
