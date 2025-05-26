package com.practica.comceptos.TodoProgramacion.APIregistro.infrastructure.entities;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.Customer;

import jakarta.persistence.Entity;

@Entity
public class CustomerEntity extends UserEntity {
    private String phone;
    private double saldo;

    public CustomerEntity(String phone, double saldo, Long id, String name, String email, String password){
        super(id, name, email, password);
        this.phone = phone;
        this.saldo = saldo;
    }

    public static CustomerEntity fromDomainModel(Customer customer){
        return new CustomerEntity(customer.getPhone(), customer.getSaldo(),customer.getId(), customer.getName(), customer.getEmail(), customer.getPassword());
    }

    public Customer toDomainModel(){
        return new Customer(phone, saldo, id, name, email, password);
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
}

