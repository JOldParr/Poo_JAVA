/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.Entidad;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    private Scanner leer = new Scanner(System.in);
    
    public Persona() {
       return;
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        
        
        if ( sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("o")){
            this.sexo = sexo;
        }
        else{
            System.out.println("Escribio un sexo distinto, debe ser: M, F u O");
            setSexo(leer.next());
            leer.close();
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    
}
