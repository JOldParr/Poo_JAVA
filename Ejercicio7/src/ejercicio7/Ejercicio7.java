/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import ejercicio7.Entidad.Persona;
import ejercicio7.Servicios.ServiciosPersona;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Persona p = new Persona();
        ServiciosPersona sp = new ServiciosPersona();
        sp.CrearPersona(p);
        sp.CalcularIMC(p);
        sp.MayorEdad(p);
        */
        System.out.println("Indique la cantidad de personas");
        int cantPersonas = leer.nextInt();
        Persona arregloPersonas[]  = new Persona[cantPersonas];
        ServiciosPersona arregloServicios[] = new ServiciosPersona[cantPersonas];
        System.out.println("CrearPersonas");
        int promedioIMC;
        int ContBajoDePeso=0;
        int ContPesoIdeal=0;
        int ContSobrePeso=0;
        int ContObesidad=0;
        
        int MayoresDe18=0;
        for ( int i=0; i<cantPersonas ; i++ ){
            arregloPersonas[i] = new Persona();
            arregloServicios[i] = new ServiciosPersona();
            arregloServicios[i].CrearPersona(arregloPersonas[i]);
            //almacenamiento para sacar porcentaje de IMC
            promedioIMC = arregloServicios[i].CalcularIMC(arregloPersonas[i]);
            switch(promedioIMC){
                case 0:
                    ContBajoDePeso +=1;
                    break;
                case 1:
                    ContPesoIdeal +=1;
                    break;
                case 2:
                    ContSobrePeso +=1;
                    break;
                case 3:
                    ContObesidad +=1;
                    break;
            }
            //fin almacenamiento
            MayoresDe18 += arregloServicios[i].MayorEdad(arregloPersonas[i]);
        }
        //calculo de porcentaje IMC de los participantes
        System.out.println("Tenemos la siguiente estadística de los pesos");
        System.out.println("Bajos de peso " + 100*((double)ContBajoDePeso/(double)cantPersonas) + "%");
        System.out.println("Peso Ideal " + 100*((double)ContPesoIdeal/(double)cantPersonas) + "%");
        System.out.println("Sobre Peso " + 100*((double)ContSobrePeso/(double)cantPersonas) + "%");
        System.out.println("Obesidad " + 100*((double)ContObesidad/(double)cantPersonas) + "%");
        System.out.println(" ");
        System.out.println("Estadística de mayores de edad");
        int menores=cantPersonas-MayoresDe18;
        System.out.println("Tenemos " + MayoresDe18 + " mayores de edad con " + menores + " menores de edad");
        //muestreo de datos
        /*for(int i=0; i<cantPersonas;i++){
            System.out.println(arregloPersonas[i].toString());
        
        }*/
    }
    
}
