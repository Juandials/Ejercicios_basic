/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author judil
 */
public class Ejercicio32 {

    public void operacion() throws ParseException {
        String hora;
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Digite la hora en formato HH:mm:ss");
        hora = sc.nextLine();
        Date hour = sdf.parse(hora);
        System.out.println("");
    }
}
