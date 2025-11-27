package com.firas.game.restControllers;

import com.firas.game.config.Configuration;
import com.firas.game.dto.APIResponseDto;
import com.firas.game.dto.GameDto;
import com.firas.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/games")
@AllArgsConstructor
public class GameController {
    private GameService gameService;

    @Autowired
    Configuration configuration;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getGameById(@PathVariable("id") Long id) {
        return new ResponseEntity<APIResponseDto>(
                gameService.getGameById(id), HttpStatus.OK);
    }

    @GetMapping("/author")
    public ResponseEntity<String> getAuthorInfo() {
        return ResponseEntity.ok(configuration.getName() + " " + configuration.getEmail());
    }
}