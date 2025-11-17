package com.chessApp.application.service;

import com.github.bhlangonijr.chesslib.pgn.PgnHolder;

import java.io.File;
import java.nio.file.Files;
import org.springframework.stereotype.Service;

import com.chessApp.application.entity.Game; 

@Service
public class PgnService {

 public Game parsePgn(String pgn) {
    try {
        // Criar arquivo temporário
        File temp = File.createTempFile("pgn_input", ".pgn");
        Files.writeString(temp.toPath(), pgn);

        // Criar holder APENAS com o arquivo
        PgnHolder holder = new PgnHolder(temp.getAbsolutePath());

        // Carrega e parseia o PGN (tudo dentro desse método)
        holder.loadPgn();

        // Pega lista de jogos
        var games = holder.getGames();

        if (games.isEmpty()) {
            throw new RuntimeException("Nenhum jogo encontrado no PGN.");
        }

        var parsed = games.get(0);
        parsed.loadMoveText();

        Game newGame = new Game();
        newGame.setPgn(pgn);
        newGame.setMovesList(parsed.getMoveText().toString());
        newGame.setFinalFen(parsed.getFen());
        newGame.setHeaderBlack(parsed.getBlackPlayer().getName());
        newGame.setHeaderWhite(parsed.getWhitePlayer().getName());
        newGame.setHeaderResult(parsed.getResult().getDescription());
        newGame.setHeaderEvent(parsed.getRound().getEvent().getName());

        return newGame;

    } catch (Exception e) {
        throw new RuntimeException("Erro ao parsear PGN: " + e.getMessage(), e);
    }
}


}