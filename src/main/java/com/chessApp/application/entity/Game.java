package com.chessApp.application.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="user_id")
    private User user;

    @Lob // Para texto longo
    private String pgn;

    @Lob // Para a lista de movimentos (ex: "1. e4 e5 2. Nf3")
    private String movesList;

    private String finalFen;

    // Headers do PGN
    private String headerWhite;
    private String headerBlack;
    private String headerResult;
    private String headerEvent;
}
