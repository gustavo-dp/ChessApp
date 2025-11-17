package com.chessApp.application.dto.response;

import lombok.Data;

@Data
public class GameResponseDTO {
    private Long id;
    private Long userId;
    private String pgn;
    private String finalFen;
    private String movesList;

    private String white;
    private String black;
    private String event;
    private String result;
    
}
