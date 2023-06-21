/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ServiciosPersona {

    private Scanner leer = new Scanner(System.in);

    public void crearPersona(Persona a) {
        System.out.println("Indique su nombre");
        a.setNombre(leer.nextLine());
        System.out.println("Indique el día: ");
        int dia = leer.nextInt();

        System.out.println("Indique el mes: ");
        int mes = leer.nextInt();

        System.out.println("Indique el anio: ");
        int anio = leer.nextInt();

        LocalDate Fecha = LocalDate.of(anio, mes, dia);
        a.setFechaNacimiento(Fecha);
    }

    public int calcularEdad(Persona a) {
        LocalDate FechaActual = LocalDate.now();
        Period Edad = Period.between(a.getFechaNacimiento(), FechaActual);
        System.out.println("El señor " + a.getNombre() + " tiene " + Edad.getYears() + " años.");
        return Edad.getYears();
    }

    public boolean menorQue(int Edad) {
        System.out.println("Ingrese una edad");
        int dato = leer.nextInt();
        boolean bool;
        if (dato > Edad) {
            System.out.println(dato + ">" + Edad);
            bool = true;
        } else {
            System.out.println(dato + "<=" + Edad);
            bool = false;
        }
        return bool;
    }

    public void mostrarPersona(Persona a) {
        System.out.println(a.toString());
    }

}
