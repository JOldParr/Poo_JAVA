/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

import Entidad.Persona;

/**
 *
 * @author Julian
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("paco", 1.75 , 18, 'm');
        System.out.println(p.nombre + " tiene " + p.edad + " años, mide: " + p.estatura + " con sexo: " + p.sexo);
        Persona pp = new Persona();
        
        
    }
    
}
