package com.chessApp.application.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    private Player whitePlayer;

    @OneToOne(fetch = FetchType.LAZY)
    private Player blackPlayer;

    private Result result;

    private String site;

    @OneToOne(fetch = FetchType.LAZY)
    private Pgn pgn;

    private LocalDateTime date;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "game")
    private List<Moves> moves;

    @ManyToOne(fetch = FetchType.LAZY)
    private Matches matches;

}
