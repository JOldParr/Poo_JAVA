/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import ejercicio8.Entidad.Cadena;
import ejercicio8.Servicios.ServiciosCadena;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ejercicio8 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe una frase");
        
        Scanner leer = new Scanner(System.in);
        
        Cadena c = new Cadena(leer.nextLine());
        ServiciosCadena sc = new ServiciosCadena();
        
        
        sc.unirFrase(c);
        sc.reemplazar(c);
        sc.contiene(c);
    }
    
}
