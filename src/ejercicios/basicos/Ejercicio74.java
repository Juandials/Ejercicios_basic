/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.basicos;

/**
 *
 * @author judil
 */
public class Ejercicio74 {

    public void operacion() {
        String x = "abcdef";
        String h = "";
        char a[] = x.toCharArray();
        char y[] = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            System.out.print("" + a[i]);
        }
        System.out.println("");
        int c = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            y[i] = a[c];
            c = c - 1;
        }
        System.out.println(h = h.valueOf(y));
    }
}
