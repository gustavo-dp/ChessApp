package com.chessApp.application.service;
import com.github.bhlangonijr.chesslib.pgn.PgnHolder;
import org.springframework.stereotype.Service;

import com.chessApp.application.entity.Game;

@Service
public class PgnService {
    public Game parsePgn(String pgn){
        try{
        PgnHolder pgnHolder = new PgnHolder(pgn);
        pgnHolder.loadPgn(pgn);

        com.github.bhlangonijr.chesslib.game.Game jogoParseado = pgnHolder.getGames().get(0);

        jogoParseado.loadMoveText(); // Processa os movimentos

        Game newGame = new Game();

        newGame.setPgn(pgn);
        newGame.setMovesList(jogoParseado.getMoveText().toString());
        newGame.setFinalFen(jogoParseado.getFen());
        newGame.setHeaderBlack(jogoParseado.getBlackPlayer().getName());
        newGame.setHeaderWhite(jogoParseado.getWhitePlayer().getName());
        newGame.setHeaderResult(jogoParseado.getResult().getDescription());
        newGame.setHeaderEvent(jogoParseado.getRound().getEvent().getName());
            return newGame;
        }catch (Exception e) {
            throw new RuntimeException("Falha ao parsear PGN: " + e.getMessage(), e);
        }
    }
}
