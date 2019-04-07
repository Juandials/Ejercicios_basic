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
public class Ejercicio32 {

    public void operacion() {
        int hora, minuto = 0, segundo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la hora en formato HH:mm:ss");
        System.out.println("Digite HH");
        hora = sc.nextInt();
        while (hora >= 24) {
            System.out.println("HH de ser menor a 24h");
            System.out.println("Digite HH");
            hora = sc.nextInt();
        }
        System.out.println("Digite mm");
        minuto = sc.nextInt();
        while (minuto >= 60) {
            System.out.println("mm de ser menor de 60m");
            System.out.println("Digite mm");
            minuto = sc.nextInt();
        }
        System.out.println("Digite ss");
        segundo = sc.nextInt();
        while (segundo >= 60) {
            System.out.println("ss deber ser menor de 60");
            System.out.println("Digite ss");
            segundo = sc.nextInt();
        }
        segundo = segundo+1;
        if(segundo==60){
            segundo=0;
            minuto=minuto+1;
            if(minuto==60){
                minuto=0;
                hora=hora+1;
                if(hora==24){
                    hora=0;
                }
            }
        } 
        System.out.println(""+hora+":"+minuto+":"+segundo+"");
    }
}
