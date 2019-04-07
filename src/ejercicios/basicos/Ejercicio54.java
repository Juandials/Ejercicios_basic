/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.basicos;

/**
 *
 * @author SonyVAIO
 */
public class Ejercicio54 {
    public static void operacion() {
           int pares[]; 
        pares = new int[99];
            for (int i=1;i<=99;i++){
                if (i % 2==0){
                    pares[i]=i;
                    System.out.println((pares[i]));
                }
            } 
    }

    }
        