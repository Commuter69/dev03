package com.firas.game.service;

import com.firas.game.dto.APIResponseDto;
import com.firas.game.dto.GameDto;

public interface GameService {
    APIResponseDto getGameById(Long id);
}