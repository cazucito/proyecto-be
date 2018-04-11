package com.gs.sistemas.curso.be.util;

import com.gs.sistemas.curso.be.model.*;

public class GeneradorID {

    private static int idCliente = 0;
    private static int idEjecutivo = 0;

    public static int generaId(TipoUsuario tP) {

        switch (tP) {
            case EJECUTIVO:
                return ++idEjecutivo;
            case CLIENTE:
                return ++idCliente;
            default:
                System.out.println("TIPO DE PERSONA NO PERMITIDO");
                return -1;
        }

    }
}
