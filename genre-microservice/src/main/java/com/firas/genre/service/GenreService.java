package com.firas.genre.service;

import com.firas.genre.dto.GenreDto;

public interface GenreService {
    GenreDto getGenreByCode(String code);
}
