package com.firas.genre.repos;


import com.firas.genre.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
    Genre findByGenCode(String genCode);
}

