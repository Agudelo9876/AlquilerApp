package com.practica.comceptos.TodoProgramacion.APIregistro.infrastructure.entities;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String name;
    protected String email;
    protected String password;

    public UserEntity(){

    }

    public UserEntity(Long id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static UserEntity fromDomainModel(User user){
        return new UserEntity(user.getId(), user.getName(), user.getEmail(), user.getPassword()); 
    }

    public User toDomainModel(){
        return new User(id, name, email, password);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
