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
public class Ejercicio12 {
    public void operacion (){
    float a,b,c;
    Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el valor de a:");
    a=sc.nextFloat();
     System.out.println("Ingrese el valor de b:");
    b=sc.nextFloat();
     System.out.println("Ingrese el valor de c:");
    c=sc.nextFloat();
        System.out.println(((a+7*c)/(b+2-a)+2*b));
        }        
}
