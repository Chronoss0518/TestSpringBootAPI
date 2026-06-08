package com.test.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/test/api")
@RestController
public class TestApiController
{
    @GetMapping("/hello")
    public String GetHello()
    {
        return "Hello World";
    }
}
