package com.gs.sistemas.curso.be.model;

public class Persona {

    private String nombre;
    private String apellidos;
    private Domicilio domicilio;

    public Persona(String nombre, String apellidos, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append("nombre/apellidos:").append(nombre).append("/").append(apellidos);
        sb.append(">");
        return sb.toString();
    }

}
