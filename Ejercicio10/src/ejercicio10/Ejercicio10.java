/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;


/**
 *
 * @author Julian
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int [50];
        int b[] = new int [20];
        System.out.print("[");
        for (int i =0; i<=a.length-1 ; i++){
            a[i] = (int) (Math.random()*10);
            System.out.print(a[i] + ", ");
        }
        System.out.print("]");
        System.out.println("");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("______________________________________________");
        System.out.print("[");
        for (int i =0; i<=b.length-1 ; i++){
            if(i<10){
            b[i] = a[i];
            System.out.print(b[i] + ", ");
            }else{
            System.out.print(0.5 + ", ");
            }
            
        }
        
        
       
        
    }
    
}

