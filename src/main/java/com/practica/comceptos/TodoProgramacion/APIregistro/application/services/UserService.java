package com.practica.comceptos.TodoProgramacion.APIregistro.application.services;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.Customer;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.Homeowner;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.in.CreateUserCustomerUseCase;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.in.CreateUserHomeownerUseCase;

public class UserService implements CreateUserCustomerUseCase, CreateUserHomeownerUseCase {
    
    private final CreateUserCustomerUseCase createUserCustomerUseCase;
    private final CreateUserHomeownerUseCase createUserHomeownerUseCase;
    
    public UserService(CreateUserCustomerUseCase createUserCustomerUseCase, CreateUserHomeownerUseCase createUserHomeownerUseCase){
        this.createUserCustomerUseCase = createUserCustomerUseCase;
        this.createUserHomeownerUseCase = createUserHomeownerUseCase;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return createUserCustomerUseCase.createCustomer(customer);
    }
    
    @Override
    public Homeowner createHomeowner(Homeowner homeowner) {
        return createUserHomeownerUseCase.createHomeowner(homeowner);
    }
}
