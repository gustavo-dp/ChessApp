package com.chessApp.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chessApp.application.entity.Game;

public interface GameRepository extends JpaRepository<Game,Long>{

}
