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
public class Retiro {

    private String cuenta;
    private String tipo;
    private double valorRetiro;
    private String documetoDepositante;
    private Date fecha;

    public Retiro() {
    }

    public Retiro(String cuenta, String tipo, double valorRetiro, String documetoDepositante, Date fecha) {
        this.cuenta = cuenta;
        this.tipo = tipo;
        this.valorRetiro = valorRetiro;
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

    public double getValorRetiro() {
        return valorRetiro;
    }

    public void setValorRetiro(double valorRetiro) {
        this.valorRetiro = valorRetiro;
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
        return "Retiro{" + "cuenta=" + cuenta + ", tipo=" + tipo + ", valorRetiro=" + valorRetiro + ", documetoDepositante=" + documetoDepositante + ", fecha=" + fecha + '}';
    }
    
    
    
}
