package com.easycode.restfuljava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Properties;

@Controller
public class SimpleInfoController {
    @GetMapping("/simple_info")
    public String sendSimpleInfo(Model model) {
        // System 정보를 얻어옴
        Properties properties = System.getProperties();

        // model 객체에 아래의 attribute를 추가함 (attribute 이름, attribute 값)
        model.addAttribute("os.name", properties.getProperty("os.name"));
        model.addAttribute("os.arch", properties.getProperty("os.arch"));
        model.addAttribute("os.version", properties.getProperty("os.version"));

        return "simple_info";
    }
}
