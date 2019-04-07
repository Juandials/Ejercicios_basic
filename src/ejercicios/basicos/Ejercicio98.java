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
public class Ejercicio98 {

    public void operacion() {
        int arg = 4, pow = 3, var;
        var = pow(arg, pow);
        System.out.println(var);
    }

    public int pow(int x, int y) {
        int a;
        if (y == 0) {
            return 1;
        } else {
            a = pow(x, y / 2);
            if (y % 2 == 0) {
                return a * a;

            } else {
                return x * a * a;
            }
        }
    }
}
