/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.basicos;


/**
 *
 * @author SonyVAIO
 */
public class Ejercicio18 {
    public void operacion(){
        float m,y=3700;
        System.out.println("horas: " + (3700/3600));
        m = (3700%3600)/60;
        System.out.println("minutos: " + m);
        System.out.println("segundos: " + ((3700%3600)-(m*60)));
   
    }
}
