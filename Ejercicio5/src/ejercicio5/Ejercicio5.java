/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.Entidad.CuentaBancaria;
import ejercicio5.Servicios.ServicioCuenta;

/**
 *
 * @author Julian
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sistema basico de muestreo de la información sin menú interactivo
        ServicioCuenta sc = new ServicioCuenta();
        CuentaBancaria cb = sc.CrearCuenta();
        //muestreo de los datos creados de la cuenta
        //System.out.println(cb.toString());
        
        //ingresar dinero a la cuenta
        sc.Ingresar(cb);
        //System.out.println(cb.toString());
        
        //retirar dinero de la cuenta
        sc.Retirar(cb);
        //System.out.println(cb.toString());
        
        sc.ExtraccionRapida(cb);
        //System.out.println(cb.toString());
        
        sc.ConsultarSaldo(cb);
        //System.out.println(cb.toString());        
        
        sc.ConsultarDatos(cb);
        //System.out.println(cb.toString());        
                
        
    }
    
}
