package com.chessApp.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chessApp.application.dto.request.UserRequestDTO;
import com.chessApp.application.entity.User;
import com.chessApp.application.service.UserService;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3006")
@RequiredArgsConstructor
public class UserController {
        private final UserService userService;
        
        @PostMapping("/create")
        public ResponseEntity<User> createUser(@RequestBody UserRequestDTO request){
            try{
                User user = userService.createUser(request);
                return ResponseEntity.ok(user);
            }catch(Exception e){
                e.printStackTrace();
                return ResponseEntity.badRequest().build();
            }
        }

    
}
