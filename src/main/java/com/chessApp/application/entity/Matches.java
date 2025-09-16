package com.chessApp.application.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(fetch = FetchType.LAZY,  cascade = CascadeType.ALL, mappedBy = "matches")
    private List<Game> games;

}
