package com.chessApp.application.service;


import org.springframework.stereotype.Service;

import com.chessApp.application.dto.request.UserRequestDTO;
import com.chessApp.application.entity.User;
import com.chessApp.application.repository.UserRepository;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User createUser(UserRequestDTO request){
        User newUser = new User();
        newUser.setName(request.getName());
        newUser.setEmail(request.getEmail());
        return userRepository.save(newUser);
    }
    
}
