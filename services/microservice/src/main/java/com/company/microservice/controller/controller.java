package com.company.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1")
public class controller {

    @GetMapping("/hello")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello from Railway + Spring!");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> bye() {
        return ResponseEntity.ok("Bye...");
    }

    @GetMapping("/public/test")
    public ResponseEntity<String> all() {
        return ResponseEntity.ok("Public...");
    }

    @GetMapping("/private/test")
    public ResponseEntity<String> restricted() {
        return ResponseEntity.ok("Private...");
    }
}
