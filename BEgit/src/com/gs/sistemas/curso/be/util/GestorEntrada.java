package com.gs.sistemas.curso.be.util;

import java.util.Scanner;

public class GestorEntrada {

    public static int leeEntero(String _entrada) {
        int enteroLeido = -1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\t" + _entrada + " ");
        enteroLeido = teclado.nextInt();
        System.out.println("");
        return enteroLeido;
    }

    public static String leeCadena(String _entrada) {
        String strLeida = "";
        Scanner teclado = new Scanner(System.in);
        System.out.print("\t" + _entrada + ": ");
        strLeida = teclado.next();
        System.out.println("");
        return strLeida;
    }
}
