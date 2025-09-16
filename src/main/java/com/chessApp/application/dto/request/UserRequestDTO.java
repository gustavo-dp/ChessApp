package com.chessApp.application.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {
    private String username;
    private String email;
    private String elo;
}
