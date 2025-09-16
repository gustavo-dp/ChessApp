package com.chessApp.application.dto.response;

import com.chessApp.application.entity.User;

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
    private Long id;
    private String username;
    private String email;
    private String password;
    private String elo;
    public UserResponseDTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.elo = user.getElo();
    }
}
