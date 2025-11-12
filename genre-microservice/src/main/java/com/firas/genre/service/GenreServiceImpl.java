package com.firas.genre.service;

import com.firas.genre.dto.GenreDto;
import com.firas.genre.entities.Genre;
import com.firas.genre.repos.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GenreServiceImpl implements GenreService {

    GenreRepository genreRepository;

    @Override
    public GenreDto getGenreByCode(String code) {
        Genre genre = genreRepository.findByGenCode(code);
        GenreDto genreDto = new GenreDto(
                genre.getId(),
                genre.getGenName(),
                genre.getGenCode()
        );
        return genreDto;
    }
}

