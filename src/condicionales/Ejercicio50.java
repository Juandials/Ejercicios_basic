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
public class Ejercicio50 {
    public void operacion(){
        float a=0;
        for(int i=0;i<=200;i++){
            a=i+a;
        }
        System.out.println("Suma: "+ a +" x̄ = " + (a/200));
    }
}
