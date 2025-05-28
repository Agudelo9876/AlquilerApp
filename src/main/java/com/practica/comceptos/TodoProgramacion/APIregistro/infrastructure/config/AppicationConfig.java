package com.practica.comceptos.TodoProgramacion.APIregistro.infrastructure.config;

import org.springframework.context.annotation.Bean;

import com.practica.comceptos.TodoProgramacion.APIregistro.application.services.UserService;
import com.practica.comceptos.TodoProgramacion.APIregistro.application.usecases.CreateUserCustomerUseCaseImlp;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.out.UserRepositoryPort;
import com.practica.comceptos.TodoProgramacion.APIregistro.infrastructure.repositories.JpaUserRepositoryAdapter;

public class AppicationConfig {
    
    public UserService userService(UserRepositoryPort userRepositoryPort){
        return new UserService(
            new CreateUserCustomerUseCaseImlp(userRepositoryPort)
        );
    }

    @Bean 
    public UserRepositoryPort taskRepositoryPort(JpaUserRepositoryAdapter jpaUserRepositoryAdapter){
        return jpaUserRepositoryAdapter;
    }
}
