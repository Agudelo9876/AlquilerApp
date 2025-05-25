package com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.in;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.Customer;

public interface CreateUserCustomerUseCase {

    Customer createCustomer(Customer customer);
    
}
