package com.practica.comceptos.TodoProgramacion.APIregistro.application.usecases;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.User;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.in.CreateUserUseCase;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.out.UserRepositoryPort;

public class CreateUserCustomerUseCaseImlp implements CreateUserUseCase{
    private final UserRepositoryPort userRepositoryPort;

    public CreateUserCustomerUseCaseImlp(UserRepositoryPort userRepositoryPort){
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        return userRepositoryPort.createUser(user);
    }

}
