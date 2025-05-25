package com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.out;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.Customer;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.Homeowner;

public interface UserRepositoryPort {

    Customer createCustomer(Customer customer);

    Homeowner createHomeowner(Homeowner homeowner);
}
