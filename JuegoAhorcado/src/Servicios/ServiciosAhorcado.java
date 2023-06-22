/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ServiciosAhorcado {

    private Ahorcado a;
    private Scanner leer = new Scanner(System.in);

    /*crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud 
    del vector. Después ingresa la palabra en el vector, letra por letra, quedando 
    cada letra de la palabra en un índice del vector. Y también, guarda en 
    cantidad de jugadas máximas, el valor que ingresó el usuario y encontradas en 0.*/
    public void crearJuego() {
        System.out.println("Escriba la palabra para jugar");
        String palabra = leer.nextLine();
        System.out.println("Indique la cantidad de intentos máximos");
        a.setJugadasMaximas(leer.nextInt());
        String[] array = new String[palabra.length()];
        for(int i=0; i<palabra.length(); i++){
            array[i] = String.valueOf(palabra.charAt(i));
        }
        for(int i=0; i<palabra.length(); i++){
            System.out.println(array[i]);
        }
    }

    /*muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.*/
    public void longitud() {

    }

    /*este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra 
    estaba o no.
    public void buscar(letra) {

    }

    /*que reciba una letra ingresada por el usuario y muestre cuantas letras han
    sido encontradas y cuantas le faltan. Este método además deberá devolver true
    si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
    busque una letra que no esté, se le restará uno a sus oportunidades.
    public void encontradas(letra) {

    }

    /*para mostrar cuantas oportunidades le queda al jugador.*/
    public void intentos() {

    }

    /*el método juego se encargará de llamar todos los métodos previamente 
    mencionados e informará cuando el usuario descubra toda la palabra o se quede
    sin intentos. Este método se llamará en el main.*/
    public void juego(Ahorcado a) {

    }
}
