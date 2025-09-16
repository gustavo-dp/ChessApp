package com.chessApp.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Moves {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
