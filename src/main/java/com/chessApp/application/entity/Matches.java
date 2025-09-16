package com.chessApp.application.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;
@Getter
@Entity
public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(fetch = FetchType.LAZY,  cascade = CascadeType.ALL, mappedBy = "matches")
    private List<Game> games;

}
