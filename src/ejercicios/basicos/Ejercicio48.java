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
public class Ejercicio48 {
    public static void operacion ()  {
        int c,n,a;
        System.out.print("Ingresa un numero: ");
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        c= 0;
        for(n = 1; n <= a; n++){
            if((a % n) == 0){
                c++;
            }
        }
        if(c <= 2){
            if(c==0 || c==1){
                System.out.println("El numero no es primo");
            }else{
                System.out.println("El numero es primo");
                }
            if(c > 2){
            System.out.println("El numero no es primo");
            }
        }
    }
}

