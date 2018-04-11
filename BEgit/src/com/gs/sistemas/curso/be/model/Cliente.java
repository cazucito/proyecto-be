package com.gs.sistemas.curso.be.model;

import java.util.List;

public class Cliente extends Persona {

    private int id;
    private List<Cuenta> cuentas;

    public Cliente(int id, String nombre, String apellidos, Domicilio domicilio) {
        super(nombre, apellidos, domicilio);
        this.id = id;

    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(super.toString());
        sb.append("id:").append(id);
        sb.append("cuentas:").append(cuentas);
        sb.append(">");
        return sb.toString();
    }

}
