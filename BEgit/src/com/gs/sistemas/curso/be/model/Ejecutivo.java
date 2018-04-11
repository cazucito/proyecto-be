package com.gs.sistemas.curso.be.model;

public class Ejecutivo extends Persona {
    private int id;

    public Ejecutivo(int id, String nombre, String apellidos, Domicilio domicilio) {
        super(nombre, apellidos, domicilio);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
}
