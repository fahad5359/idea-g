package com.example.idea.g.logic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

// if we wanted to add somthing by hand
@Configuration
public class config {
    @Bean
    CommandLineRunner commandLineRunner(Idao idao){
        return args -> {
            Ischema Fahad =new Ischema(
                    1,
                    "fahad",
                    "hey?",
                    "faah4232@gmail.com"
            );
            Ischema khaled =new Ischema(
                    2,
                    "khaled",
                    "new  coffe machine",
                    "kall23ew2@gmail.com"
            );

            idao.saveAll(List.of(Fahad,khaled)
            );
        };
    }
}
