package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {


    @GetMapping
    public String getIp() {
        return "Hello World";
    }
}
