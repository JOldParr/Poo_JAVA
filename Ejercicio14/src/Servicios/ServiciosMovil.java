/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.movil;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ServiciosMovil {

    private Scanner leer = new Scanner(System.in);

    public void CargarMovil(movil a) {
        System.out.println("Ingrese la marca");
        a.setMarca(leer.nextLine());
        
        System.out.println("Ingrese el Precio");
        a.setPrecio(leer.nextDouble());
        
        System.out.println("Ingrese el modelo");
        a.setModelo(leer.nextLine());
    
        System.out.println("Ingrese la memoria Ram");
        a.setMemoriaRam(leer.nextInt());
        
        System.out.println("Ingrese el almacenamiento");
        a.setAlmacenamiento(leer.nextInt());
    leer.close();
    }
    
    public void ingresarCodigoMovil(movil a){
        System.out.println("Ingrese el código del movil" + a.getMarca() + " " + a.getModelo());
        String cod = leer.nextLine();
        String datoCorrecto;
        if (cod.length()>7 || cod.length()<7){
            System.out.println("Código mal ingresado");
            ingresarCodigoMovil(a);
        }else{
            System.out.println("El código ingresado: " + cod + " ¿Es correcto?");
            datoCorrecto = leer.nextLine();
            if (datoCorrecto.equalsIgnoreCase("si")){
                System.out.println("Dato Ingresado correctamente"); 
               
            }else{
                System.out.println("Ingreselo Nuevamente");
                ingresarCodigoMovil(a);
            }
        }
        int[] codigo = new int [a.getCodigo().length];
        int dato= Integer.parseInt(cod);
        int indice = a.getCodigo().length-1;
        while(dato>0){
            int digito = dato % 10; // Obtener el último dígito
            codigo[indice] = digito; // Asignar el dígito al arreglo
            dato /= 10; // Eliminar el último dígito del número
            indice--; // Incrementar el índice para avanzar en el arreglo
        }
        a.setCodigo(codigo);
    } 
    
}
