/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.distribuidas.websocket.cajero.controller;

import java.util.Date;

/**
 *
 * @author Luig Rocha
 */
public class Deposito {

    private String cuenta;
    private String tipo;
    private double valorDeposito;
    private String documetoDepositante;
    private Date fecha;

    public Deposito() {
    }

    public Deposito(String cuenta, String tipo, double valorDeposito, String documetoDepositante, Date fecha) {
        this.cuenta = cuenta;
        this.tipo = tipo;
        this.valorDeposito = valorDeposito;
        this.documetoDepositante = documetoDepositante;
        this.fecha = fecha;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public String getDocumetoDepositante() {
        return documetoDepositante;
    }

    public void setDocumetoDepositante(String documetoDepositante) {
        this.documetoDepositante = documetoDepositante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Deposito{" + "cuenta=" + cuenta + ", tipo=" + tipo + ", valorDeposito=" + valorDeposito + ", documetoDepositante=" + documetoDepositante + ", fecha=" + fecha + '}';
    }

}
