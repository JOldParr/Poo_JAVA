/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoahorcado;

import Entidad.Ahorcado;
import Servicios.ServiciosAhorcado;

/**
 *
 * @author Julian
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ahorcado a = new Ahorcado();
        ServiciosAhorcado sa = new ServiciosAhorcado();
        sa.crearJuego();
    }
    
}
