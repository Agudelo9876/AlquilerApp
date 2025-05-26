package com.practica.comceptos.TodoProgramacion.APIregistro.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.comceptos.TodoProgramacion.APIregistro.infrastructure.entities.UserEntity;

public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {

}
