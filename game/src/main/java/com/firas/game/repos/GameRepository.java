package com.firas.game.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.firas.game.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}