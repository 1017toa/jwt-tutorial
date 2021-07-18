package com.example.jwttutorial;

import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api")
public class HelloController{
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("hello");
    }
}