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

    private Scanner leerString = new Scanner(System.in);
    private Scanner leerInt = new Scanner(System.in);
    private int espacios = 0;

    /*crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud 
    del vector. Después ingresa la palabra en el vector, letra por letra, quedando 
    cada letra de la palabra en un índice del vector. Y también, guarda en 
    cantidad de jugadas máximas, el valor que ingresó el usuario y encontradas en 0.*/
    public void crearJuego(Ahorcado a) {
        System.out.println("Escriba la palabra para jugar");
        String palabra = leerString.nextLine();
        System.out.println("Indique la cantidad de intentos máximos");
        a.setJugadasMaximas(leerInt.nextInt());

        String[] arrayPalabra = new String[palabra.length()];

        String[] arrayPalabraEscondida = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            arrayPalabra[i] = String.valueOf(palabra.charAt(i));
            if (String.valueOf(palabra.charAt(i)).equalsIgnoreCase(" ")) {
                arrayPalabraEscondida[i] = " ";
                espacios++;
            } else {
                arrayPalabraEscondida[i] = "-";
            }
        }

        //for (int i = 0; i < palabra.length(); i++) {
        //  System.out.println(arrayPalabra[i]);
        //}
        int letterFounded = 0;
        a.setPalabra(arrayPalabra);
        a.setPalabraEscondida(arrayPalabraEscondida);
        a.setLetrasEncontradas(letterFounded);
        muestreoJuego(a);
    }

    /*muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.*/
    public void longitud(Ahorcado a) {
        System.out.println("la longitud de la palabra es:" + a.getPalabra().length);
    }

    /*este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra 
    estaba o no.*/
    public void buscar(Ahorcado a) {

        boolean encontro = false;

        if (a.getJugadasMaximas() > 0) {
            String[] array = a.getPalabra();
            String[] escondida = a.getPalabraEscondida();
            System.out.println("______________________________________");
            System.out.println("Te quedan:" + a.getJugadasMaximas() + " intentos");
            System.out.print("Escribe una letra: ");
            String letra = leerString.next();

            for (int i = 0; i < a.getPalabra().length; i++) {
                if (letra.equalsIgnoreCase(array[i])) {
                    encontro = true;
                    escondida[i] = letra;
                    a.setLetrasEncontradas(a.getLetrasEncontradas() + 1);
                }
            }
            if (encontro) {
                System.out.println("Si se encontró la letra");
            } else {
                System.out.println("Esa letra no esta: ");
                a.setJugadasMaximas(a.getJugadasMaximas() - 1);
            }
            a.setPalabraEscondida(escondida);
            muestreoJuego(a);
            if (a.getLetrasEncontradas() == (a.getPalabra().length) - espacios) {
                System.out.println("Ganaste el juego");
                a.setJugadasMaximas(0);
            } else {
                buscar(a);
            }

        } else {
            System.out.println("fin del juego");
        }
        
    }

    public void muestreoJuego(Ahorcado a) {
        String[] escondida = a.getPalabraEscondida();
        for (int i = 0; i < a.getPalabra().length; i++) {
            System.out.print(escondida[i]);
        }
        System.out.println(" ");
    }

    /*que reciba una letra ingresada por el usuario y muestre cuantas letras han
    sido encontradas y cuantas le faltan. Este método además deberá devolver true
    si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
    busque una letra que no esté, se le restará uno a sus oportunidades.
    public void encontradas(letra) {

    }

    /*para mostrar cuantas oportunidades le queda al jugador.
    public int intentos(int intentos, int j,Ahorcado a) {
        int attempt = a.getJugadasMaximas();
        if(j==1){
        attempt=intentos;
        }
        return attempt;
    }*/

 /*el método juego se encargará de llamar todos los métodos previamente 
    mencionados e informará cuando el usuario descubra toda la palabra o se quede
    sin intentos. Este método se llamará en el main.*/
    public void juego(Ahorcado a) {

    }
}
