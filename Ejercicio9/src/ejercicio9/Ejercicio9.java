/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import ejercicio9.Entidad.Matematica;
import ejercicio9.Servicios.ServiciosMatematica;

/**
 *
 * @author Julian
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matematica m = new Matematica();
        ServiciosMatematica sm = new ServiciosMatematica();
        
        m.setMayor(Math.random()*10);
        m.setMenor(Math.random()*10);
        sm.devolverMayor(m);
        sm.calcularPotencia(m);
        sm.calcularRaiz(m);
        
    }
    
}
