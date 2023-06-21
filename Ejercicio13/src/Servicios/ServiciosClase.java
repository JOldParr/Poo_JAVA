/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Clase;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ServiciosClase {

    private Scanner leerInt = new Scanner(System.in);
    private Scanner leerString = new Scanner(System.in);
    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Indique el nombre del alumno: " + (i+1) + " ");
            alumnos[i] = leerString.nextLine();
            System.out.println("");
        }
        return alumnos;
    }

    public void crearCurso(Clase a) {
        System.out.print("nombre del curso: ");
        a.setNombreCurso(leerString.nextLine());
        System.out.println("");

        System.out.print("¿Cuántos días por semana?: ");
        a.setCantidadDiasPorSemana(leerInt.nextInt());
        System.out.println("");

        System.out.print("¿Cuántos horas por día?: ");
        a.setCantidadHorasPorDia(leerInt.nextInt());
        System.out.println("");

        System.out.print("Turno de la MANAÑA ó la TARDE: ");
        a.setTurno(leerString.nextLine());
        System.out.println("");

        System.out.print("Precio por Hora: $");
        a.setPrecioPorHora(leerInt.nextDouble());
        System.out.println("");

        System.out.println("Agregue los alumnos del curso: ");
        a.setAlumnos(cargarAlumnos());
    }

    public void calcularGananciaSemanal(Clase a) {
        int horas = a.getCantidadHorasPorDia();
        double precio = a.getPrecioPorHora();
        int dias = a.getCantidadDiasPorSemana();
        int cantAlumnos = a.getAlumnos().length;
        double ganancia = horas*precio*dias*cantAlumnos;
        System.out.println("Ud se ganaría: $" + ganancia);
    }

}
