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
public class Ejercicio42 {
    public void operacion(){
       int a;
        Scanner sc = new Scanner(System.in);
          System.out.println("ingrese un numero");
          a = sc.nextInt(); 
         int s = 0;
        int c = a;
        while (c != 0) {
            s = s + c;
            c--;
            }
 System.out.println("La suma de enteros hasta  " + a + " es " + s);
            }      
    }
