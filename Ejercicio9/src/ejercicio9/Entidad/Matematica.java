/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.Entidad;

/**
 *
 * @author Julian
 */
public class Matematica {
    private double Mayor;
    private double Menor;

    public Matematica() {
    }

    public Matematica(double Mayor, double Menor) {
        this.Mayor = Mayor;
        this.Menor = Menor;
    }

    public double getMayor() {
        return Mayor;
    }

    public void setMayor(double Mayor) {
        this.Mayor = Mayor;
    }

    public double getMenor() {
        return Menor;
    }

    public void setMenor(double Menor) {
        this.Menor = Menor;
    }

    
    
    
}
