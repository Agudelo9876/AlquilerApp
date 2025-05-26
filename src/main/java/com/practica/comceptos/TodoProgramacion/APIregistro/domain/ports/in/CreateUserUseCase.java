package com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.in;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.User;

public interface CreateUserUseCase {

    User createUser(User user);
    
}
