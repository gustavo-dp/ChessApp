package com.chessApp.application.dto.request;

import com.chessApp.application.dto.response.MatchesResponseDTO;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class GameResponseDTO {
    @Setter(lombok.AccessLevel.NONE)
    private Long id;
    private String user;
    private String whitePlayer;
    private String blackPlayer;
    private String result;
    private String site;
    private String pgn;
    private LocalDateTime date;
    private List<MovesResponseDTO> moves;
    private MatchesResponseDTO matchesId;

}
