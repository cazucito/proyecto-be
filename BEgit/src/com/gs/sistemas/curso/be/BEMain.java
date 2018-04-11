package com.gs.sistemas.curso.be;

import com.gs.sistemas.curso.be.model.Banco;
import com.gs.sistemas.curso.be.model.Domicilio;
import com.gs.sistemas.curso.be.model.Ejecutivo;
import com.gs.sistemas.curso.be.model.ServicioCliente;
import com.gs.sistemas.curso.be.util.GestorEntrada;
import java.util.Optional;

public class BEMain {

    public static void main(String[] args) {
        Banco banco = Banco.getInstance();
        // BIENVENIDA
        banco.muestraBienvenida();
        // LOGIN
        int tipoPersona = GestorEntrada.leeEntero("Ingresar al sistema como\n\t[1] Ejecutivo [2] Cliente: ");
        switch (tipoPersona) {
            case 1:
                Optional<Ejecutivo> e1 = banco.loginEjecutivo(1, "clave");
                // EJECUTIVO
                // Crear Cliente 1
                ServicioCliente srvCliente = new ServicioCliente();
                srvCliente.altaCliente("Cliente a", "Apellido a", new Domicilio("Calle a", 123));
                banco.imprimeClientes();
                // Crear Cliente 2
                // Cambiar datos Cliente 2
                // Borrar Cliente 2
                // Crear dos Cuentas (ahorro y cheques)
                // *Borrar Cuenta
                // Consultar cuentas
                // Detalle de cuenta
                break;
            case 2:
                break;
            default:
                System.out.println("OPCIÓN NO CONSIDERADA");
        }

        // CLIENTE
        // Consultar cuentas
        // Detalle de cuenta (estado de cuenta, movimientos)
        // Deposito
        // Detalle de cuenta (estado de cuenta, movimientos)
        // Retiro
        // Detalle de cuenta (estado de cuenta, movimientos)
        // DESPEDIDA
    }

}
