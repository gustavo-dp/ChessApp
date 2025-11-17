package com.mapper;

import com.chessApp.application.dto.response.GameResponseDTO;
import com.chessApp.application.entity.Game;

public class GameMapper {
    public static GameResponseDTO toDTO(Game game){
        GameResponseDTO dto = new GameResponseDTO();

        dto.setId(game.getId());
        dto.setUserId(game.getUser().getId());
        dto.setPgn(game.getPgn());
        dto.setFinalFen(game.getFinalFen());
        dto.setMovesList(game.getMovesList());

        dto.setWhite(game.getHeaderWhite());
        dto.setBlack(game.getHeaderBlack());
        dto.setEvent(game.getHeaderEvent());
        dto.setResult(game.getHeaderResult());

        return dto;
    }
}
