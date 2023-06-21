/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import ejercicio2.Entidad.Circunferencia;
import java.util.Scanner;
/**
 *
 * @author Julian
 */

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner data = new Scanner(System.in);
        int info =data.nextInt();
        Circunferencia r= new Circunferencia(info);
        
        r.Perimetro(info);
        r.Area(info);
        
        
        
    }
    
}

