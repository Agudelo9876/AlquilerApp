package com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.in;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.Homeowner;

public interface CreateUserHomeownerUseCase {

    Homeowner createHomeowner(Homeowner homeowner);
} 
