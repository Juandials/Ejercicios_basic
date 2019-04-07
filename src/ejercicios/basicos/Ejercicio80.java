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
public class Ejercicio80 {

    public void operacion() {
        String x = "aaaaaaaa";
        char y[] = x.toCharArray();

        for (int i = 0; i < y.length; i++) {
            if (i % 2 == 0) {
                y[i] = (char) (y[i] + (char) 2);
            } else {
                y[i] = (char) (y[i] + (char) 3);
            }
        }
        
        String e = "";
        System.out.println("Encriptado: "+(e = e.valueOf(y)));
    }
}
