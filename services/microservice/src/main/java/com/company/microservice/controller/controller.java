package com.company.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello from Railway + Spring!");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> bye() {
        return ResponseEntity.ok("Bye...");
    }
}
