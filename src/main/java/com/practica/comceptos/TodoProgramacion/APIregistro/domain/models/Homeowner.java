package com.practica.comceptos.TodoProgramacion.APIregistro.domain.models;

public class Homeowner extends User{
    private int cantidadPropiedades;
    private String calificacion;

    public Homeowner(int cantidadPropiedades, String calificacion, Long id, String name, String email, String password){
        super(id, name, email, password);
        this.cantidadPropiedades = cantidadPropiedades;
        this.calificacion = calificacion;
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
