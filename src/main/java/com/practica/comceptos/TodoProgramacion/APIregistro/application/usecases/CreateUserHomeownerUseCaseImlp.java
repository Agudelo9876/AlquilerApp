package com.practica.comceptos.TodoProgramacion.APIregistro.application.usecases;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.Homeowner;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.in.CreateUserHomeownerUseCase;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.out.UserRepositoryPort;

public class CreateUserHomeownerUseCaseImlp implements CreateUserHomeownerUseCase {
    private final UserRepositoryPort userRepositoryPort;

    public CreateUserHomeownerUseCaseImlp(UserRepositoryPort userRepositoryPort){
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Homeowner createHomeowner(Homeowner homeowner) {
        return userRepositoryPort.createHomeowner(homeowner);
    }
}
