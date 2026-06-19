package com.test.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestIndexController {
    
    @GetMapping("/index")
    public String GetIndexModel(Model model) {
        model.addAttribute("value","Test");
        return "index";
    }
}
