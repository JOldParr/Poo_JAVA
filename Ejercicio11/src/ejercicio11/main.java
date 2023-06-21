/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/
/**
 *
 * @author Julian
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el día: " );
        int dia= leer.nextInt();
        
        System.out.println("Indique el mes: " );
        int mes= leer.nextInt();
        
        System.out.println("Indique el anio: " );
        int anio= leer.nextInt();
        
        LocalDate FI = LocalDate.of(anio, mes, dia);
        System.out.println(FI);
        LocalDate FA = LocalDate.now();
        System.out.println(FA);
        
        Period periodo = Period.between(FI, FA);
        System.out.println("Diferencia de años: " + periodo.getYears());
        System.out.println("Diferencia de mes: " + periodo.getMonths());
        System.out.println("Diferencia de dias: " + periodo.getDays());
        System.out.println(periodo.getYears()*2);
    }
    
}
