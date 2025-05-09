package com.hayvantakip.hayvantakip.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.hayvantakip.hayvantakip.dtos.request.RegisterRequest;
import com.hayvantakip.hayvantakip.dtos.response.RegisterResponse;
import com.hayvantakip.hayvantakip.models.User;
import com.hayvantakip.hayvantakip.repositories.UserRepository;

public class AuthService {
    
    private final UserRepository userRepository;

    @Autowired
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public RegisterResponse register(RegisterRequest request) {
        User user = new User(request.getName(), null, request.getPassword(), request.getEmail(), null, null);
        userRepository.save(user); 
        return new RegisterResponse(user.getId(), user.getEmail());

    }
}
