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
public class Ejercicio60 {
    public void operacion(){
        int[] num = {23,45,68,99,10,15,4};
        int i;      
        int mayor = num[0];
        for (i=0; i<7; i++)
        if (num[i] > mayor)
            mayor = num[i];
        System.out.println(mayor);
}
    }
