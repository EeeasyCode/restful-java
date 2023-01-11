package com.easycode.restfuljava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleInfoController {
    @GetMapping("/simple_info")
    public String sendSimpleInfo() {
        return "simple_info";
    }
}
