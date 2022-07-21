package com.mxixm.spring.boot.chapter03.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 章鑫
 */
@Controller
@RequestMapping
public class MethodMappingController {

    @RequestMapping(path = "path1", method = RequestMethod.GET)
    public String path1(Model model) {
        model.addAttribute("name", "name");
        return "index";
    }

    @RequestMapping(path = "path1", method = RequestMethod.POST)
    public String path2() {
        return "index";
    }

}