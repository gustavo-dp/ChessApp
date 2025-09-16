package com.chessApp.application.repository;

import com.chessApp.application.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PLayerRepository extends JpaRepository<Player, Long> {
}
