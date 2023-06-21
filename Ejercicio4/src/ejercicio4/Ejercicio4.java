/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import ejercicio4.Entidad.Rectangulo;
import java.util.Scanner;
/**
 *
 * @author Julian
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato=new Scanner(System.in);
        Rectangulo rec=new Rectangulo();
        
        System.out.println("Base: ");
        rec.setBase(dato.nextInt());
        
        System.out.println("Altura: ");
        rec.setAltura(dato.nextInt());
        
        rec.CrearRectangulo(rec.getBase(),rec.getAltura());
        //rec.Perimetro();
        System.out.println(rec.Perimetro());
        System.out.println(rec.Superficie());
        //rec.Dibujar(base,altura);
        
        for(int i=0; i<rec.getAltura(); i++){
            for(int j=0; j<rec.getBase(); j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }        
    }
    
}
