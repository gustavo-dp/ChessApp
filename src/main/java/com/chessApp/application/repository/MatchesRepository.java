package com.chessApp.application.repository;

import com.chessApp.application.entity.Matches;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchesRepository extends JpaRepository<Matches, Long> {
}
