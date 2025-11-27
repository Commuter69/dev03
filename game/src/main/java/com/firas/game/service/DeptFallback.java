package com.firas.game.service;

import com.firas.game.dto.GenreDto;
import org.springframework.stereotype.Component;

@Component
public class DeptFallback implements APIClient {

    @Override
    public GenreDto getGenreByCode(String genreCode) {
        return null;
    }

    @Override
    public GenreDto getGenByCode(String genreCode) {
        return null;
    }
}