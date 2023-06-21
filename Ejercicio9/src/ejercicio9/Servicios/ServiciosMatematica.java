/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.Servicios;

import ejercicio9.Entidad.Matematica;

/**
 *
 * @author Julian
 */
public class ServiciosMatematica {
    
    public void devolverMayor(Matematica m){
        double cambioVar=0;
        if(m.getMayor() > m.getMenor()){
            System.out.println("A(" +  m.getMayor() + ") > B(" + m.getMenor() + ")");
        }else if(m.getMayor() == m.getMenor()){
            System.out.println("A(" +  m.getMayor() + ") = B(" + m.getMenor() + ")");
        }else{
            System.out.println("A(" +  m.getMayor() + ") < B(" + m.getMenor() + ")");
            cambioVar=m.getMayor();
            m.setMayor(m.getMenor());
            m.setMenor(cambioVar);
        }
    }
    
    public void calcularPotencia(Matematica m){
        System.out.println("convertir A Y B en enteros");
        System.out.println("La base es el Mayor(" +  (int)m.getMayor() + 
                ") y exponerte es el Menor(" + (int)m.getMenor() + ")");
        System.out.println((int)m.getMayor() + "^"+ (int)m.getMenor());
        System.out.println(Math.pow((int)m.getMayor(), (int)m.getMenor()));
    }
    
    public void calcularRaiz(Matematica m){
        m.setMenor((int)Math.abs(m.getMenor()));
        System.out.println("La raíz cuadrada de: "+m.getMenor()+ " es "+Math.sqrt(m.getMenor()));
    }
}
