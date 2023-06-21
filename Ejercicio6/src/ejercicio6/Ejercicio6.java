/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.Entidad.Cafetera;
import ejercicio6.Servicios.ServiciosCafetera;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ejercicio6 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        boolean ciclo= true;
        ServiciosCafetera sc = new ServiciosCafetera();
        Cafetera c = new Cafetera();
        sc.CrearCafetera(c);
        while(ciclo){
            System.out.println("Menu");
            System.out.println("1.Llenar Cafetera");
            System.out.println("2.Servir Cafe");
            System.out.println("3.Vaciar Cafetera");
            System.out.println("4.Agregar Cafe");
            System.out.println("5.Salir");
            
            System.out.print("Escoja una opcion: " );
            int opcion= leer.nextInt();
            System.out.println("");
            
            switch(opcion){
                case 1:{
                    sc.LlenarCafetera(c);
                    break;}
                case 2:{
                    sc.ServirTaza(c);
                    break;}
                case 3:{
                    sc.VaciarCafetera(c);
                    break;}
                case 4:{
                    sc.AgregarCafe(c);
                    break;}
                case 5:{
                    ciclo=false;
                    break;}             
            }
        }
    }
}
