package com.gustavo.curso.springboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gustavo.curso.springboot.error.springboot_error.models.domain.User;

@Configuration 
public class AppConfig {

    @Bean 
    List<User>users(){
        List<User> users = new ArrayList<>();
        users.add(new User(1L,"Pepe", "Gonzales"));
        users.add(new User(2L,"Gustavo", "Flores"));
        users.add(new User(3L,"Antonio", "Perez"));
        users.add(new User(4L,"Alan", "Walker"));
        users.add(new User(5L,"Pepito", "Gutierrez"));
        return users;
    }
}
