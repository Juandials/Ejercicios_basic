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
public class Ejercicio26 {
    public void operacion(){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite número");
        a = sc.nextInt();
        if(a%2==0){
            System.out.println("Número par");
        }
        else{
            System.out.println("Número impar");
        }
    }
}
