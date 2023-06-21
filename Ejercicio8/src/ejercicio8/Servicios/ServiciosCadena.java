/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.Servicios;

import ejercicio8.Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ServiciosCadena {
    private Scanner leer = new Scanner(System.in);
    
    public int mostrarVocales(Cadena a){
        int cont=0;
        for (int i=0; i<=a.getLongitud()-1;i++){           
            String dato=a.getFrase().substring(i, i+1);
            Boolean b=dato.equalsIgnoreCase("a") || dato.equalsIgnoreCase("e") || 
                    dato.equalsIgnoreCase("i") || dato.equalsIgnoreCase("o") || 
                        dato.equalsIgnoreCase("u");
            if (b)
            {
              cont +=1;  
            }
        }
        return cont;
    }
    
    public String invertirFrase(Cadena a){
        String dato= "";
        for (int i=a.getLongitud()-1; i>=0;i--){           
            dato = dato.concat(a.getFrase().substring(i, i+1)); 
        }
        return dato;
    }
   
    public void vecesRepetido(Cadena a){
        System.out.print("Ingrese un caracter: " );
        String dato = leer.nextLine();
        System.out.println("");
        int cont=0;
         for (int i=a.getLongitud()-1; i>=0;i--){           
            if (dato.equalsIgnoreCase( a.getFrase().substring(i, i+1))) 
            {
                cont +=1;
            }
        }
        System.out.println("La letra: " + dato + " se repite " + cont + " veces");
        
    }
    
    public void compararLongitud(Cadena a){
        System.out.println("Ingrese una frase: ");
        int nuevaLong = leer.nextLine().length();
        if(nuevaLong>a.getLongitud())
        {
            System.out.println("la nueva frase tiene más datos " + nuevaLong + ">" + a.getLongitud());
        }else if(nuevaLong==a.getLongitud()){
            System.out.println("ambas frases tienen la misma longitud " + nuevaLong + "=" + a.getLongitud());
        }else{
            System.out.println("la nueva frase tiene menos datos "  + nuevaLong + "<" + a.getLongitud());
        }
    }
    
    public void unirFrase(Cadena a){
        System.out.println("Ingrese una frase para ser unidad con la original: ");
        a.setFrase(a.getFrase().concat(" ").concat(leer.nextLine()));
        System.out.println(a.getFrase());
    }
    
    public void reemplazar(Cadena a){
        System.out.print("Que caracter desea reemplazar: ");
        String dato= leer.nextLine();
        System.out.println("");
        System.out.print("Lo cambiará por este: ");
        String reemplazado=leer.nextLine();
        System.out.println("");
        a.setFrase(a.getFrase().replaceAll(dato, reemplazado));
        System.out.println(a.getFrase());
    }
    
    public void contiene(Cadena a){
        System.out.print("Que caracter desea validar si existe en la frase: ");
        
        if(a.getFrase().contains(leer.nextLine())){
            System.out.println("Si existe en la frase");
        }else{
            System.out.println("No existe en la frase");
        }
        
    }
}
