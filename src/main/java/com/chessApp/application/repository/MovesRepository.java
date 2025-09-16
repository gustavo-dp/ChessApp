package com.chessApp.application.repository;

import com.chessApp.application.entity.Moves;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovesRepository extends JpaRepository<Moves, Long> {
}
