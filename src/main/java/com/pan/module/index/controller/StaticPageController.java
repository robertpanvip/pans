package com.pan.module.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class StaticPageController {
    @RequestMapping("/")
    String index() {
        return "redirect:/index.html";
    }

    @RequestMapping("/pan")
    @ResponseBody
    String pan() {
        return "{}";
    }
}
