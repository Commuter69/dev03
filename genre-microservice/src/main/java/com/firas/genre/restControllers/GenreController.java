package com.firas.genre.restControllers;

import com.firas.genre.dto.GenreDto;
import com.firas.genre.service.GenreService;
import com.firas.genre.config.Configuration; // Import de VOTRE classe Configuration
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    private final GenreService genreService;

//    @Value("${build.version}")
//    private String buildVersion;
//
//    @Autowired
//    private Configuration configuration; // VOTRE classe personnalisée

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("{code}")
    public ResponseEntity<GenreDto> getGenreByCode(@PathVariable("code") String code) {
        GenreDto genreDto = genreService.getGenreByCode(code);
        return ResponseEntity.ok(genreDto);
    }

//    @GetMapping("/version")
//    public ResponseEntity<String> getVersion() {
//        return ResponseEntity.ok(buildVersion);
//    }
//
//    @GetMapping("/author")
//    public ResponseEntity<String> getAuthorInfo() {
//        return ResponseEntity.ok(configuration.getName() + " " + configuration.getEmail());
//    }
}