package com.example.test.controller;

import com.example.test.model.Test;
import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping
    public ResponseEntity<String> getString() {
        List<Test> all = testService.findAll();
        Test test = all.get(0);
        String message = test.getHello()+ test.getLogin() + test.getNumber();
        return ResponseEntity.ok(message);
    }
}
