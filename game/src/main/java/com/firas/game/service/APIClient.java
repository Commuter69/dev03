package com.firas.game.service;

import com.firas.game.dto.GenreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8080", value = "GENRE-SERVICE")
@FeignClient(name = "GENRE-MICROSERVICE")
public interface APIClient {
    @GetMapping("api/genres/{genre-code}")
    GenreDto getGenreByCode(@PathVariable("genre-code") String genreCode);
}
