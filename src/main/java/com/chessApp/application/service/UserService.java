package com.chessApp.application.service;

import com.chessApp.application.dto.request.UserRequestDTO;
import com.chessApp.application.dto.response.UserResponseDTO;
import com.chessApp.application.entity.User;
import com.chessApp.application.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserResponseDTO findUserByEmail(String email) {
        return new UserResponseDTO(userRepository.findByEmail(email).orElseThrow());
    }

    public UserResponseDTO findUserById(Long id) {
        return new UserResponseDTO(userRepository.findById(id).orElseThrow());
    }
    @Transactional
    public UserResponseDTO updateOrCreateUser(UserRequestDTO userRequestDTO) {
        Optional<User> userOpt=  userRepository.findByEmail(userRequestDTO.getEmail());
        User user = userOpt.orElseGet(User::new);
        user.setUsername(userRequestDTO.getUsername());
        user.setEmail(userRequestDTO.getEmail());
        user.setUsername(userRequestDTO.getUsername());
        user.setElo(userRequestDTO.getElo());
        userRepository.save(user);
        return new UserResponseDTO(user);
    }
    public void deleteUserById(Long id) {
        User user =  userRepository.findById(id).orElseThrow();
        userRepository.delete(user);
    }

}
