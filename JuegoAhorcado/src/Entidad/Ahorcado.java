/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Julian
 */
public class Ahorcado {
    private String[] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private String[] palabraEscondida;
    
    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int jugadasMaximas, String[] palabraEscondida) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.palabraEscondida = palabraEscondida;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getPalabraEscondida() {
        return palabraEscondida;
    }

    public void setPalabraEscondida(String[] palabraEscondida) {
        this.palabraEscondida = palabraEscondida;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabraEscondida=" + palabraEscondida + '}';
    }
    
    
    
}
