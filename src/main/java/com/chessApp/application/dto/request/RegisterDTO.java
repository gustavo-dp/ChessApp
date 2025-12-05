package com.chessApp.application.dto.request;

import com.chessApp.application.entity.enums.UserRole;

public record RegisterDTO(String email, String password, UserRole role) {
    
}
