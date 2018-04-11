package com.gs.sistemas.curso.be.model;

import java.time.LocalDateTime;

public class Cuenta {
    private int idCuenta;
    private int balance;
    private LocalDateTime fechaAlta;

    public Cuenta(int idCuenta, int balance, LocalDateTime fechaAlta) {
        this.idCuenta = idCuenta;
        this.balance = balance;
        this.fechaAlta = fechaAlta;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public int getBalance() {
        return balance;
    }

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }
    
}
