package com.springboot.learningspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String Helloworld() {
        return "welcome to  restart jkbkj bj yfigiug fyfyu iuhiuhiu 123 nb";
    }
}
