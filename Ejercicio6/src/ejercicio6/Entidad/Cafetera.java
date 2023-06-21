/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.Entidad;

/**
 *
 * @author Julian
 */
public class Cafetera {
    private int CapacidadMaxima;
    private int CapacidadActual;
    private int Cafe;
    public Cafetera() {
    }

    public Cafetera(int CapacidadMaxima, int CapacidadActual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CapacidadActual = CapacidadActual;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public int getCapacidadActual() {
        return CapacidadActual;
    }

    public void setCapacidadActual(int CapacidadActual) {
        this.CapacidadActual = CapacidadActual;
    }

    public int getCafe() {
        return Cafe;
    }

    public void setCafe(int Cafe) {
        this.Cafe = Cafe;
    }
    
    
    
    
    
}
