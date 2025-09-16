package com.chessApp.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    @Setter(lombok.AccessLevel.NONE)
    private  Long id;
    private String username;
    private String email;
    private String password;
    private String elo;
}
