/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.basicos;

import java.util.Scanner;

/**
 *
 * @author judil
 */
public class Ejercicio20 {
    public void operacion(){
        Scanner sc = new Scanner(System.in);
        float a;
        System.out.println("Digite cantidad a convertir (m)");
        a = sc.nextFloat(); 
        System.out.println(a + " m " + "= " + (a*3.28084) + " ft");
    }
}
