package com.mxixm.spring.boot.chapter03.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 章鑫
 */
@Controller
public class ParamMappingController {

    /**
     * 打开myForm表单
     * @return
     */
    @RequestMapping("myForm")
    public String myForm() {
        return "myFormView";
    }

    /**
     * 匹配参数agreed，存在且为true时进入此处理器
     * @param firstName
     * @param lastName
     * @param model
     * @return
     */
    @RequestMapping(path = "myFormSubmit", params = {"agreed=true"})
    public String myFormAgreedSubmit(String firstName, String lastName, Model model) {
        model.addAttribute("fullName", firstName  + "." + lastName);
        return "myFormAgreedView";
    }

    /**
     * 参数agreed不存在或者存在但值不为true时进入此处理器
     * @return
     */
    @RequestMapping(path = "myFormSubmit", params = {"agreed!=true"})
    public String myFormNoAgreeSubmit() {
        return "myFormNotAgreeView";
    }

}
