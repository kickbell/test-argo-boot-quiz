package com.example.web_test_02;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/api/v1")
    public ResponseEntity<String> index(HttpServletRequest request){
        return ResponseEntity.ok("web-test: " + request.getLocalAddr());
    }
}

