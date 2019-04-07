/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author judil
 */
public class Ejercicio44 {

    public void operacion() {
        int a, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte número");
        a = sc.nextInt();
        for (int i = a; i > 1; i--) {
            b = ((b*i));
        }
        System.out.println(a + "! = " + b);
    }
}
