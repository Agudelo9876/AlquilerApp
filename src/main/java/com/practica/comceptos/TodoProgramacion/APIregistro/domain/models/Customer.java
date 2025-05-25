package com.practica.comceptos.TodoProgramacion.APIregistro.domain.models;

public class Customer  extends User{
    private String phone;
    private double saldo;

    public Customer(String phone, double saldo, Long id, String name, String email, String password){
        super(id, name, email, password);
        this.phone = phone;
        this.saldo = saldo;
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
