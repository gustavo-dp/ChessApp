package com.chessApp.application.repository;

import com.chessApp.application.entity.Pgn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PgnRepository extends JpaRepository<Pgn, Long> {
}
