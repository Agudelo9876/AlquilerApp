package com.practica.comceptos.TodoProgramacion.APIregistro.application.usecases;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.Customer;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.in.CreateUserCustomerUseCase;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.out.UserRepositoryPort;

public class CreateUserCustomerUseCaseImlp implements CreateUserCustomerUseCase{
    private final UserRepositoryPort userRepositoryPort;

    public CreateUserCustomerUseCaseImlp(UserRepositoryPort userRepositoryPort){
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return userRepositoryPort.createCustomer(customer);
    }

}
