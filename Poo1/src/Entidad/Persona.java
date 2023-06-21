/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Julian
 */
public class Persona {
    
    public String nombre;
    public double estatura;
    public int edad;
    public char sexo;//_M_F_

    public Persona(String nombre, double estatura, int edad, char sexo) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona() {
    }
    
    
    
}
