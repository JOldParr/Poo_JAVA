/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.Entidad;
import java.util.Scanner;
/**
 *
 * @author Julian
 */
public class CuentaBancaria {
    private long NumeroCuenta;
    private long DNI; 
    private int SaldoActual;
    private int Interes;

    public CuentaBancaria() {
        this.Interes =0;
    }

    public CuentaBancaria(long NumeroCuenta, long DNI, int SaldoActual) {
        Interes= 0;
        this.NumeroCuenta = NumeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
        this.Interes =0;
    }

    public long getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(long NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public int getInteres() {
        return Interes;
    }

    public void setInteres(int Interes) {
        this.Interes = Interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "NumeroCuenta=" + NumeroCuenta + ", DNI=" + DNI + ", SaldoActual=" + SaldoActual + ", Interes=" + Interes + '}';
    }
    
    
}
