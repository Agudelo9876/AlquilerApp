package com.practica.comceptos.TodoProgramacion.APIregistro.infrastructure.repositories;

import org.springframework.stereotype.Component;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.User;
import com.practica.comceptos.TodoProgramacion.APIregistro.domain.ports.out.UserRepositoryPort;
import com.practica.comceptos.TodoProgramacion.APIregistro.infrastructure.entities.UserEntity;

@Component
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    private final JpaUserRepository jpaUserRepository;

    public JpaUserRepositoryAdapter(JpaUserRepository jpaUserRepository){
        this.jpaUserRepository = jpaUserRepository;

    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = UserEntity.fromDomainModel(user);
        UserEntity savedUserEntity = jpaUserRepository.save(userEntity);
        return savedUserEntity.toDomainModel();
    }

}
