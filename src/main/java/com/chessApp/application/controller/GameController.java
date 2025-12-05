package com.chessApp.application.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chessApp.application.dto.request.CreateGameDTO;
import com.chessApp.application.dto.response.GameResponseDTO;
import com.chessApp.application.entity.Game;
import com.chessApp.application.service.GameService;
import com.mapper.GameMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/game")
@CrossOrigin(origins = "http://localhost:3006")
@RequiredArgsConstructor
public class GameController {
    private final GameService gameService;

    
    // URL: GET http://localhost:8080/jogos/games
    @GetMapping("/games")
    public List<GameResponseDTO> getAll(){
        return gameService.getAll().stream().map(game -> GameMapper.toDTO(game)).collect(Collectors.toList());
    }
     // URL: POST http://localhost:8080/jogos/create
   @PostMapping("/create")
    public ResponseEntity<GameResponseDTO> createGame(@RequestBody CreateGameDTO request){
    try {
        Game game = gameService.createByPgn(request);

        return ResponseEntity.ok(GameMapper.toDTO(game));

    } catch(Exception e) {
        e.printStackTrace();
        return ResponseEntity.badRequest().build();
    
    }
}

}
