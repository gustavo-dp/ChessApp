package com.chessApp.application.dto.request;

import lombok.Data;

@Data
public class CreateGameDTO {
    private String pgn;
    private Long userId;
    
}
