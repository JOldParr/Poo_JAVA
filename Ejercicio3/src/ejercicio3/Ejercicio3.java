/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos= new Scanner(System.in);
        Operacion r= new Operacion();
        
        System.out.println("Indique el numero 1");
        r.setNumero1(datos.nextDouble());
        
        System.out.println("Indique el numero 2");
        
        r.setNumero2(datos.nextDouble());
        
        r.CrearOperacion(r.getNumero1(),r.getNumero2());
        r.Sumar();
        r.Restar();
        r.Multiplicar();
        r.Dividir();
    }
    
}
