package com.sparta.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // API연결
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World";
    }
}
