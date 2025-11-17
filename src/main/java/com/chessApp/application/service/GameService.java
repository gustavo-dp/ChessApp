package com.chessApp.application.service;

import org.springframework.stereotype.Service;

import com.chessApp.application.dto.request.CreateGameDTO;
import com.chessApp.application.entity.Game;
import com.chessApp.application.entity.User;
import com.chessApp.application.repository.GameRepository;
import com.chessApp.application.repository.UserRepository;

import jakarta.transaction.Transactional;
import lombok.Data;
@Data
@Service
public class GameService {
    private final GameRepository gameRepository;
    private final UserRepository userRepository;
    private final PgnService pgnService;

    @Transactional
    public Game createByPgn(CreateGameDTO request){
        User user = userRepository.findById(request.getUserId()).orElseThrow();
        Game newGame = pgnService.parsePgn(request.getPgn());

        newGame.setUser(user);

        return gameRepository.save(newGame);
    }
    
}
