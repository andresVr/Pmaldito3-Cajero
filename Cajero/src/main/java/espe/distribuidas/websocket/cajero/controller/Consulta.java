/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.distribuidas.websocket.cajero.controller;

/**
 *
 * @author Luig Rocha
 */
public class Consulta {
    
    private String numeroCuenta;
    private String tipoCuenta;

    public Consulta() {
    }

    public Consulta(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }
    
    

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Consulta{" + "numeroCuenta=" + numeroCuenta + ", tipoCuenta=" + tipoCuenta + '}';
    }
    
    
    
    
}
