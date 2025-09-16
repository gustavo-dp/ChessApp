package com.chessApp.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PgnResponseDTO {
    @Setter(lombok.AccessLevel.NONE)
    private Long id;
    private String pgn;
}
