package com.mxixm.spring.boot.chapter03.argument;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 章鑫
 */
@Controller
public class MultipartArgumentResolveController {

    @RequestMapping("multipartForm")
    public String multipartForm() {
        return "myMultipartFormView";
    }

    @RequestMapping("multipartFormSubmit")
    public String multipartFormSubmit(@RequestPart String firstName, @RequestPart String lastName, @RequestPart MultipartFile photo, Model model) {
        String fullName = firstName + lastName;
        model.addAttribute("fullName", fullName);
        return "myFormAgreedView";
    }

}
