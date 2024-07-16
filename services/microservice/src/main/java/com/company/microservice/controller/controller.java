package com.company.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class controller {

    @GetMapping("/all/hello")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello to all...");
    }

    @GetMapping("/personal/hello")
    public ResponseEntity<String> bye() {
        return ResponseEntity.ok("Hello to you...");
    }

}
