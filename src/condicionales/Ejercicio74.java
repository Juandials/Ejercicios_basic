/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author judil
 */
public class Ejercicio74 {

    public void operacion() {
        String x[] = {"a", "b", "c", "d", "e", "f"};
        String a[] = new String[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("" + x[i]);
        }
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            a[i]=x[5-i];
            System.out.print(""+a[i]);
        }
        System.out.println("");
    }
}
