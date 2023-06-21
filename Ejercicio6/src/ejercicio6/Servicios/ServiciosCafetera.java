/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.Servicios;

import ejercicio6.Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ServiciosCafetera {
        private Scanner leer = new Scanner(System.in);
    public Cafetera CrearCafetera(Cafetera a){
        a.setCapacidadActual(0);
        a.setCapacidadMaxima(1000);
        System.out.println("Taza Creada");
        return a;
    }
    
    public Cafetera LlenarCafetera(Cafetera a){
        a.setCapacidadActual(a.getCapacidadMaxima());
        a.setCafe(a.getCapacidadMaxima());
        System.out.println("Cafetera Llena");
        return a;
    }
    public Cafetera ServirTaza(Cafetera a){
        
        System.out.println("Tamaño de la taza");
        int taza = leer.nextInt();
        
        System.out.println("sirviendo Taza");
        if(taza<=a.getCapacidadActual()){
            System.out.println("Taza servida en un 100%" );
            a.setCapacidadActual(a.getCapacidadActual()-taza);
            a.setCafe(a.getCafe()-taza);
        }else{
            System.out.println("Se sirvió un " + ((double)(double)a.getCapacidadActual()/(double)taza)*100 + "% de la taza");
            a.setCapacidadActual(a.getCapacidadActual()-taza);
            a.setCafe(a.getCafe()-taza);
        }
        
        return a;
    }
        public Cafetera VaciarCafetera(Cafetera a){
            a.setCapacidadActual(0);
            a.setCafe(0);
        return a;
    }
        public Cafetera AgregarCafe(Cafetera a){
            System.out.println("Cuanto café quiere agregar");
            a.setCafe(a.getCafe()+leer.nextInt());
        return a;
    }
    
}
