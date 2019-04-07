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
public class Ejercicio62 {

    public void operacion() {
        int x[] = new int [10];
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int d;
        int f = 0;
        int g = 0;
        for (int i = 0; i < 10; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (x[i] > c) {
                c = x[i];
                g = i;
            }
        }
        d = c;
        for (int i = 0; i < 10; i++) {
            if (x[i] < d) {
                d = x[i];
                f = i;
            }
        }
        System.out.println("Mayor en posición[" + g + "], menor en posición [" + f + "]");
    }
}
