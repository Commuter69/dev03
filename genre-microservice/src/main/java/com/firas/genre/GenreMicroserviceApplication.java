package com.firas.genre;

import com.firas.genre.entities.Genre;
import com.firas.genre.repos.GenreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GenreMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenreMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(GenreRepository genreRepository) {
        return args -> {
            genreRepository.save(Genre.builder()
                    .genName("Action")
                    .genCode("ACT")
                    .build());

            genreRepository.save(Genre.builder()
                    .genName("Aventure")
                    .genCode("ADV")
                    .build());
        };
    }

}
