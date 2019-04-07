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
public class Ejercicio68 {

    public void operacion() {
        int x[][] = {{5, 6, 7, 9, 0}, {11, 8, 2, 0, 0}};
        for (int i = 0; i < 2; i++) {
            for (int a = 0; a < 4; a++) {
                if (i == 0) {
                    x[0][4] = x[0][4] + x[i][a];
                }
                if (i == 1) {
                    x[1][4] = x[1][4] + x[i][a];
                }

            }
        }
        System.out.println("..." + x[0][4] + "..." + x[1][4]);
    }
}
