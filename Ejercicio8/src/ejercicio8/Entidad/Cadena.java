/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.Entidad;

/**
 *
 * @author Julian
 */
public class Cadena {
    
    private String Frase;
    private int Longitud;

    public Cadena() {
    }

    public Cadena(String Frase) {
        this.Frase = Frase;
        this.Longitud = Frase.length();
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }
    
    
    
}
