/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.basicos;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class Ejercicio10 {
     public void operacion(){
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el recorrido: ");
        a = sc.nextFloat();
        System.out.println("Ingrese el tiempo: "); 
        b = sc.nextFloat();
        
         a=a*1000;
         b=b*60;
         System.out.println("Velocidad = " + (a/b) + " m/s");
     }     
}
     
