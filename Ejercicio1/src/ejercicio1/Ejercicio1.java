/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import Entidad.Libro;
import java.util.Scanner;
/**
 *
 * @author Julian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String informacion= IngresarLibro();
        //Libro A1 = new Libro(1,"El coronel no tiene quién le escriba","Gabo",200);
        //Libro A2 = new Libro(2,"Pedro Paramo","Juan Rulfo",250);
        MostrarLibros(informacion);
        System.out.println("data");
        System.out.println();
    /**
     *public int ISBN;
     * public String Titulo;
     *  public String Autor;
     * public int NumeroPaginas;
     */
    
        
       
        
    }
    public static String IngresarLibro(){
        Scanner datoInt = new Scanner(System.in);
        Scanner datoString = new Scanner(System.in);
        Libro L1= new Libro();
        
        System.out.println("ISBN");
        L1.setISBN(datoInt.nextInt());
        
        System.out.println("TITULO");
        L1.setTitulo(datoString.nextLine());
        
        System.out.println("AUTOR");
        L1.setAutor(datoString.nextLine());
        
        System.out.println("Pags");
        L1.setNumeroPaginas(datoInt.nextInt());
        //System.out.println(L1);
        
        String info=L1.toString();
        return info;

    }
    public static void MostrarLibros(String info){
        //System.out.println("ISBN - TITULO - AUTOR - PAGS");
        System.out.println(info);
        
        return;
    }
    
}
