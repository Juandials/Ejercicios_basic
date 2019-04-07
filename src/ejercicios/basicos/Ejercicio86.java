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
public class Ejercicio86 {

    public void operacion() {
        String y = "reconocer";
        char x[] = y.toCharArray();
        int a = x.length;
        boolean z = true;
        for (int i = 0; i < (x.length / 2); i++) {
            a = a - 1;
            if (x[i] != x[a]) {
                z = false;
            }
        }
        if (z == true) {
            System.out.print("" + y + " es palindromo");
        } else {
            System.out.print("" + y + " no es palindromo :(");
        }
    }
}
