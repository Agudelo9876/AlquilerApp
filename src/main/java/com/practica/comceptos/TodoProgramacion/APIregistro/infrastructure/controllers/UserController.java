package com.practica.comceptos.TodoProgramacion.APIregistro.infrastructure.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.comceptos.TodoProgramacion.APIregistro.application.services.UserService;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.User;

@RestController
@RequestMapping("api/user")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createTask(@RequestBody User user){
        User createUser = userService.createUser(user);
        return new ResponseEntity<>(createUser, HttpStatus.CREATED); 
    }
}
