/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.Entidad;

/**
 *
 * @author Julian
 */
public class Circunferencia {
        private int radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
        
    public void CrearCircunferencia(int radio){
        this.radio = radio;
    }
    public void Area(int radio){
        this.radio=radio;
        double area=(Math.PI*radio*radio);
        System.out.println("Area: " + area);
    }
    public void Perimetro(int radio){
        this.radio=radio;
        double perimetro=(Math.PI*radio*2);
        System.out.println("Perimetro: " + perimetro);
                
    }
}
