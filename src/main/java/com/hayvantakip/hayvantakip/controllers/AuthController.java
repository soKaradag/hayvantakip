package com.hayvantakip.hayvantakip.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hayvantakip.hayvantakip.dtos.request.LoginRequest;
import com.hayvantakip.hayvantakip.dtos.request.RegisterRequest;
import com.hayvantakip.hayvantakip.dtos.response.LoginResponse;
import com.hayvantakip.hayvantakip.dtos.response.RegisterResponse;
import com.hayvantakip.hayvantakip.services.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}
