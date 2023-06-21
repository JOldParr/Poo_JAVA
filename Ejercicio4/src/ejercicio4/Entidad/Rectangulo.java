/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.Entidad;

/**
 *
 * @author Julian
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base,int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
   
    
    
    
    public void CrearRectangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public int Superficie(){
        System.out.println("La superficie es: ");
        return altura*base;
    }
    
    public int Perimetro(){
        System.out.println("El perímetro es: ");
        return 2*(altura+base);
    }
    
    public void Dibujar(int b,int a){
        
        
        return;
    }
    
    
}
