package com.firas.game.service;

import com.firas.game.dto.GenreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "GENRE-MICROSERVICE", fallback = DeptFallback.class)
public interface APIClient {

    @GetMapping("/api/genres/{genre-code}")
    GenreDto getGenreByCode(@PathVariable("genre-code") String genreCode);

    @GetMapping("/api/genres/gen/{departmentCode}")
    GenreDto getGenByCode(@PathVariable String departmentCode);
}