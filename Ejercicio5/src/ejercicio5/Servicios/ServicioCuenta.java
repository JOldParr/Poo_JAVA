/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.Servicios;

import ejercicio5.Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ServicioCuenta {
    
    private Scanner leer = new Scanner (System.in);
    
    public CuentaBancaria CrearCuenta(){
        
        System.out.println("Indique número de cuenta");
        long Cuenta = leer.nextLong();
        
        System.out.println("Indique DNI");
        long Dni = leer.nextLong();
        
        System.out.println("Indique Saldo Actual");
        int SaldoActual = leer.nextInt();
        return new CuentaBancaria(Cuenta,Dni,SaldoActual);
    }
    
    //el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
    public CuentaBancaria Ingresar(CuentaBancaria a){
        System.out.println("Indique la cantidad de dinero a Ingresar: $");
        //al saldo actual se le suma el saldo ingresado
        a.setSaldoActual(a.getSaldoActual()+leer.nextInt());
        
        return a;
    }
    
    //el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. 
    //Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
    public CuentaBancaria Retirar(CuentaBancaria a){
        System.out.print("Indique la cantidad de dinero a Retirar: $");
        //al saldo actual se le suma el saldo ingresado
        int SaldoRetirar = leer.nextInt();
        if (SaldoRetirar>a.getSaldoActual())
        {
            System.out.println("No se puede retirar esa cantidad, intente nuevamente");
            ServicioCuenta.this.Retirar(a);
        }else{
            a.setSaldoActual(a.getSaldoActual()-SaldoRetirar);
            System.out.println("Saldo: $"+a.getSaldoActual());
        }
        return a;
    }
    
    //le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public CuentaBancaria ExtraccionRapida(CuentaBancaria a){
        System.out.println("Solo puede sacar máximo: $" + a.getSaldoActual()*20/100);
        int SaldoExtraccionRetirar = leer.nextInt();
        if (SaldoExtraccionRetirar>a.getSaldoActual()*20/100)
        {
            System.out.println("No se puede retirar esa cantidad, intente nuevamente");
            ServicioCuenta.this.ExtraccionRapida(a);
        }else{
            a.setSaldoActual(a.getSaldoActual()-SaldoExtraccionRetirar);
            System.out.println("Saldo: $"+a.getSaldoActual());
        }        
        return a;
    }
    
    //permitirá consultar el saldo disponible en la cuenta.
    public CuentaBancaria ConsultarSaldo(CuentaBancaria a){
        System.out.println("Su saldo actual es: $" + a.getSaldoActual());
        return a;
    }
    
    
    //permitirá mostrar todos los datos de la cuenta
    public CuentaBancaria ConsultarDatos(CuentaBancaria a){
        System.out.println(a.toString());
        return a;
    }
    
}
