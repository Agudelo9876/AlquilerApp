package com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.out;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.User;

public interface UserRepositoryPort {

    User createUser(User user);

}
