/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.basicos;

import java.util.Scanner;

public class Ejercicio16 {
    
    public void operacion (){
        float a,b;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el valor del primer cateto:");
        a = sc.nextFloat();
        System.out.println("Ingrese el valor del segundo cateto:");
        b = sc.nextFloat();
      
        System.out.println(Math.sqrt((Math.pow(a,2))+(Math.pow(b,2))));
    }
    
}
