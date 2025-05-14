package com.example.java_project.controller;

import com.example.java_project.DTO.UserDTO;
import com.example.java_project.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDTO request) {
        authService.register(request);
        return ResponseEntity.ok("User registered successfully");
    }
}
