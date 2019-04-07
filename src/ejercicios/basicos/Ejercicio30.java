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
public class Ejercicio30 {
    public void operacion(){
        float num1,num2,num4,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1= sc.nextFloat();
        System.out.println("ingrese el segundo numero");
        num2 = sc.nextFloat(); 
        if (num1>num2) {
            num3=num2;
            num4=num1;
            System.out.println("primero: " + num3);
            System.out.println("segundo " + num4);
             }
                 
    }
}
