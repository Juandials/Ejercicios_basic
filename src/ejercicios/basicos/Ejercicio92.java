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
public class Ejercicio92 {

    public void operacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite unidades a comprar: ");
        int x = sc.nextInt();
        System.out.print("Digite precio unitario: ");
        int y = sc.nextInt();
        int a = descuento(x, y);
        System.out.println(", precio total = " + a);
    }

    public int descuento(int x, int y) {
        if (x > 6) {
            if (x > 12) {
                System.out.print("Descuento del 10%");
                return (y - ((y*x / 100) * 10));
            }
            System.out.print("Descuento del 4%");
            return ((y - ((y*x / 100) * 4))*x);
        }
        System.out.print("Descuento del 0%");
        return y*x;
    }
}
