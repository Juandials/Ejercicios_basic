/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio28 {
    
    public void operacion (){
        
        int a;
        Scanner sc = new Scanner (System.in);
     
        System.out.println("Ingrese un numero del 1 al 7: ");
        
        a = sc.nextInt();
        
        if (a<1 || a>7){
            System.out.println("Ingrese un numero entre 1 y 7");
        }
        else {
            if (a==1){
                System.out.println("Lunes");
            }
            else{
                if (a==2){
                    System.out.println("Martes");
                }
                else{
                    if (a==3){
                       System.out.println("Miercoles"); 
                    }
                    else{
                        if (a==4){
                            System.out.println("Jueves");
                        }
                        else{
                            if (a==5){
                                System.out.println("Viernes");
                            }
                            else{
                                if (a==6){
                                    System.out.println("Sabado");
                                }
                                else{
                                    if (a==7){
                                        System.out.println("Domingo");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
