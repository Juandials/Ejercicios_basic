/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.basicos;

import java.util.Scanner;

/**
 *
 * @author SonyVAIO
 */
public class Ejercicio24 {
    public void operacion(){
         float a;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero");
        a = sc.nextFloat(); 
        if (a==0) {
            System.out.println("el numero 0 no es positivo ni negativo");
             }
        if (a>0) {
            System.out.println("el numero es positivo");
           }
        if (a<0){
            System.out.println("el numero es negativo");
        }
            
    }
}
