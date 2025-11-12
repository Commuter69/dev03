package com.firas.game;

import com.firas.game.repos.GameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class GameApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(GameRepository gameRepository) {
        return args -> {
            gameRepository.save(com.firas.game.entities.Game.builder()
                    .title("The Legend of Zelda")
                    .developer("Nintendo")
                            .GenCode("ACT")
                    .build());
        };
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}
