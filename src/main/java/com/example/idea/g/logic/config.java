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
//          Ischema ali= new Ischema(
//                  1,
//                  "ali",
//                  "asjuhiuahddsi",
//                  "ali@gmai.conmdj"
//          );
//
//            idao.saveAll(List.of(ali)
//            );
        };
    }
}
