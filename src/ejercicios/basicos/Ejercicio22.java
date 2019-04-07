/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.basicos;

import java.util.Scanner;

public class Ejercicio22 {
    
    public void operacion (){
        int a,b;
        
        Scanner sc = new Scanner (System.in);
        
     System.out.println("Ingrese el valor de a:");
    a=sc.nextInt();
     System.out.println("Ingrese el valor de b:");
    b=sc.nextInt();
        System.out.println("la division es: " + (a/b) + "    el residulo es: " + (a%b));
    }
    
}
