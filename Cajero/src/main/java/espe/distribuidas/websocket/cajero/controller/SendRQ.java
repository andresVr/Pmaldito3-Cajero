/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.distribuidas.websocket.cajero.controller;

import com.espe.distribuidas.protocolocajero.operaciones.ConcultarCuentaRQ;
import com.espe.distribuidas.protocolocajero.operaciones.DepositoRQ;
import com.espe.distribuidas.protocolocajero.operaciones.RetiroRQ;
import com.espe.distribuidas.protocolocajero.pc.Originador;
import com.espe.distribuidas.protocolocajero.pc.Mensaje;
import com.espe.distribuidas.protocolocajero.pc.MensajeRQ;
import com.espe.distribuidas.protocolocajero.seguridad.AutenticacionRQ;

/**
 *
 * @author Luig Rocha
 */
public class SendRQ {

    public String construirMs(Usuario usu) {
        AutenticacionRQ aurq = new AutenticacionRQ();
        aurq.setUsuario(usu.getUsuario());
        aurq.setClave(usu.getClave());
        MensajeRQ rq = new MensajeRQ(Originador.getOriginador(Originador.CLIENTE), Mensaje.AUTENTIC_USER);
        rq.setCuerpo(aurq);
        return rq.asTexto();
    }
    public String construirMsC(Cliente cli) {
//        IngresarClienteRQ aurq = new IngresarClienteRQ();
//        aurq.setTipoDocumento(cli.getTipo());
//        aurq.setValorDocumento(cli.getDoc());
//        aurq.setNombre(cli.getNombre());
//        aurq.setApellido(cli.getApellido());
//        aurq.setDireccion(cli.getDireccion());
//        aurq.setNumeroTelefono(cli.getTelefono());
//        aurq.setNumeroMovil(cli.getCelular());
//        aurq.setCorreo(cli.getCorreo());
//        aurq.setFechaNacimiento(cli.getNacimiento());
//        MensajeRQ rq = new MensajeRQ(Originador.getOriginador(Originador.CLIENTE), Mensaje.AUTENTIC_USER);
//        rq.setCuerpo(aurq);
//        System.out.print(rq);
//        return rq.asTexto();
        return null;
    }
    public String construirConsulta(Consulta consulta){
        
        ConcultarCuentaRQ cuenta = new ConcultarCuentaRQ();
        cuenta.setCuenta(consulta.getNumeroCuenta());
        cuenta.setCuenta(consulta.getTipoCuenta());
        MensajeRQ rq = new MensajeRQ(Originador.getOriginador(Originador.CLIENTE), Mensaje.AUTENTIC_USER);
        rq.setCuerpo(cuenta);
        System.err.println(rq);
        return  rq.asTexto();
    }
    public String construirRetiro(Retiro retiro){
        
        RetiroRQ retiroqr = new RetiroRQ();
        retiroqr.setCuenta(retiro.getCuenta());
        retiroqr.setDocumetoDepositante(retiro.getDocumetoDepositante());
        retiroqr.setTipo(retiro.getTipo());
        retiroqr.setValorRetiro(retiro.getValorRetiro());
        retiroqr.setFecha(retiro.getFecha());
        
        MensajeRQ rq = new MensajeRQ(Originador.getOriginador(Originador.CLIENTE), Mensaje.AUTENTIC_USER);
        rq.setCuerpo(retiroqr);
        System.err.println(rq);
        return  rq.asTexto();
    }
    public String construirDeposito(Deposito deposito){
        
        DepositoRQ depositoqr = new DepositoRQ();
        depositoqr.setCuenta(deposito.getCuenta());
        depositoqr.setDocumetoDepositante(deposito.getDocumetoDepositante());
        depositoqr.setTipo(deposito.getTipo());
        depositoqr.setValorDeposito(deposito.getValorDeposito());
        depositoqr.setFecha(deposito.getFecha());
        MensajeRQ rq = new MensajeRQ(Originador.getOriginador(Originador.CLIENTE), Mensaje.AUTENTIC_USER);
        rq.setCuerpo(depositoqr);
        System.err.println(rq);
        return  rq.asTexto();
    }

}
