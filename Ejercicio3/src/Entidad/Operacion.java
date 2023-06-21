/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void CrearOperacion(double num1,double num2){
        this.numero1=num1;
        this.numero2=num2;        
        System.out.println("op creada");
    }
    public void Sumar(){
        double suma=numero1+numero2;
        System.out.println("Suma: "+ suma);
    }
    
    public void Restar(){
        double resta=numero1-numero2;
        System.out.println("Resta: "+ resta);
    }
    
    public void Multiplicar(){
        double multiplicar=numero1*numero2;
        System.out.println("Multiplicacion: "+ multiplicar);
    }
    //double num1,double num2  datos prueba como atributos del método
    public void Dividir(){
        if(numero2==0){
            System.out.println("Para dividir, el numero 2 debe ser distinto a 0");
            Scanner datos= new Scanner(System.in);
            System.out.println("Indique el numero 2");
            this.numero2=datos.nextDouble();
            System.out.println("aquí están las nuevas operaciones");
            Sumar();
            Restar();
            Multiplicar();
            Dividir();
            
        }else{
        double dividir=numero1/numero2;
            System.out.println("Dividir: "+ dividir);
        }
    }
}
