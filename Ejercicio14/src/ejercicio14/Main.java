/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import Entidad.movil;
import Servicios.ServiciosMovil;

/**
 *
 * @author Julian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        movil m = new movil();
        ServiciosMovil sm = new ServiciosMovil();
        sm.ingresarCodigoMovil(m);
        System.out.println("mueche el codigo perro");
        m.toString();
 

        
    }
    
}
