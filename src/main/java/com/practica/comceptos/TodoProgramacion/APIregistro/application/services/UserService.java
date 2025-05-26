package com.practica.comceptos.TodoProgramacion.APIregistro.application.services;

import org.springframework.stereotype.Service;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.User;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.in.CreateUserUseCase;

@Service
public class UserService implements CreateUserUseCase{
    
    private final CreateUserUseCase createUserUseCase;
    
    public UserService(CreateUserUseCase createUserCustomerUseCase){
        this.createUserUseCase = createUserCustomerUseCase;
    }

    @Override
    public User createUser(User user) {
        return createUserUseCase.createUser(user);
    }
}
