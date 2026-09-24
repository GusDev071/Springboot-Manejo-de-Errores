package com.gustavo.curso.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gustavo.curso.springboot.error.springboot_error.models.domain.User;

@Service 
public class UserServiceImpl implements UserService {

    public List<User> users;

    public UserServiceImpl(){
        this.users = new ArrayList<>();
        users.add(new User(1L,"Pepe", "Gonzales"));
        users.add(new User(2L,"Gustavo", "Flores"));
        users.add(new User(3L,"Antonio", "Perez"));
        users.add(new User(4L,"Alan", "Walker"));
        users.add(new User(5L,"Pepito", "Gutierrez"));
    }

    @Override
    public List<User> findAll() {
       return null;
    }

    @Override
    public User findById(Long id) {
       User user = null;
       for (User u : users) {
         if(u.getId().equals(id)){
            user = u;
            break;
         }
       }
       return user;
    }
    
}
