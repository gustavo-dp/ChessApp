package com.chessApp.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pgn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String pgn;
}
