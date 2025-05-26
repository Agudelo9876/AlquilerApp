package com.practica.comceptos.TodoProgramacion.APIregistro.infrastructure.entities;

import com.practica.comceptos.TodoProgramacion.APIregistro.domain.models.Homeowner;

public class HomeownerEntity extends UserEntity{
    private int cantidadPropiedades;
    private String calificacion;

    public HomeownerEntity(){
        
    }

    public HomeownerEntity(int cantidadPropiedades, String calificacion, Long id, String name, String email, String password){
        super(id, name, email, password);
        this.cantidadPropiedades = cantidadPropiedades;
        this.calificacion = calificacion;
    }

    public static HomeownerEntity fromDomainModel(Homeowner homeowner){
        return new HomeownerEntity(homeowner.getCantidadPropiedades(), homeowner.getCalificacion(), homeowner.getId(), homeowner.getName(), homeowner.getEmail(), homeowner.getPassword()); 
    }

    public Homeowner toDomainModel(){
        return new Homeowner(cantidadPropiedades, calificacion, id, name, email, password);
    }

    public int getCantidadPropiedades() {
        return this.cantidadPropiedades;
    }

    public void setCantidadPropiedades(int cantidadPropiedades) {
        this.cantidadPropiedades = cantidadPropiedades;
    }

    public String getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
