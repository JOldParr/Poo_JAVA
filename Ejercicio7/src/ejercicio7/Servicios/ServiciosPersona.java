/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.Servicios;

import ejercicio7.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ServiciosPersona {
    
    private Scanner leer = new Scanner(System.in);
    
    public void CrearPersona(Persona a){
        
        System.out.println("Indique nombre");
        a.setNombre(leer.nextLine());
        
        System.out.println("Indique Edad");
        a.setEdad(leer.nextInt());
        
        System.out.println("Indique Sexo ( M - F - 0)");
        a.setSexo(leer.next());
        
        System.out.println("Indique Peso en Kg");
        a.setPeso(leer.nextDouble());
        
        System.out.println("Indique Altura en metros");
        a.setAltura(leer.nextDouble());
        
    }
    
    public int CalcularIMC(Persona a){
        double IMC = a.getPeso()/Math.pow(a.getAltura(), 2);
            System.out.println("El sr " + a.getNombre() + " tiene un IMC= " + IMC);
            if(IMC<18.5){
                    System.out.println("Peso Inferior al normal");
                    return 0;
                }
            if(IMC>=18.5 && IMC<=24.9){
                    System.out.println("Peso normal");
                    return 1;
                }
            if(IMC>=25 && IMC<=29.9){
                    System.out.println("Peso superior al normal");
                    return 2;
                }else{
                System.out.println("Obesidad");
                return 3;
            }    
        
    }
    
    public int MayorEdad(Persona a){
        if(a.getEdad()>=18)
        {
            System.out.println("Eres mayor de edad");
            return 1;
        }else{
            System.out.println("Eres un pequeñín");
            return 0;
        }
        
    }
}
