package com.firas.game.service;

import com.firas.game.dto.APIResponseDto;
import com.firas.game.dto.GameDto;
import com.firas.game.dto.GenreDto;
import com.firas.game.entities.Game;
import com.firas.game.repos.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class GameServiceImpl implements GameService {

    private GameRepository gameRepository;
    //private WebClient webClient;
    private APIClient apiClient;


    @Override
    public APIResponseDto getGameById(Long id) {
        Game game = gameRepository.findById(id).get();

//        GenreDto genreDto = webClient.get()
//                .uri("http://localhost:8080/api/genres/" + game.getGenCode())
//                .retrieve()
//                .bodyToMono(GenreDto.class)
//                .block();
        GenreDto genreDto = apiClient.getGenreByCode(game.getGenCode());

        GameDto gameDTO = new GameDto(
                game.getId(),
                game.getTitle(),
                game.getDeveloper(),
                game.getGenCode(),
                genreDto.getGenName()
        );



        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setGameDto(gameDTO);
        apiResponseDto.setGenreDto(genreDto);

        return apiResponseDto;
    }
}