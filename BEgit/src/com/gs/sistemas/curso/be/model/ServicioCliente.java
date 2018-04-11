package com.gs.sistemas.curso.be.model;

import com.gs.sistemas.curso.be.util.GeneradorID;
import java.time.LocalDateTime;

public class ServicioCliente {
    public Cliente altaCliente(String nombre, String apellidos, Domicilio dom){
        Cliente c = new Cliente(GeneradorID.generaId(TipoUsuario.CLIENTE), nombre, apellidos, dom);
        //Cuenta cuenta = new Cuenta(0, 0, LocalDateTime.MAX)
        Banco banco = Banco.getInstance();
        banco.altaCliente(c);
        //System.out.println("\tAlta Cliente: " + c);
        return c;
    }
}
