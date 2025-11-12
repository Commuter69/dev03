package com.firas.genre.restControllers;

import com.firas.genre.dto.GenreDto;
import com.firas.genre.service.GenreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/genres")
@AllArgsConstructor
public class GenreController {

    private GenreService genreService;

    @GetMapping("{code}")
    public ResponseEntity<GenreDto> getGenByCode(@PathVariable("code") String code) {
        return new ResponseEntity<GenreDto>(
                genreService.getGenreByCode(code),
                HttpStatus.OK
        );
    }
}
