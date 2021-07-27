package com.example.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private int serverPort;

    @GetMapping
    public ResponseEntity<String> getString() {

         return ResponseEntity.ok("Hello World! Server.port="+serverPort);
    }
}
