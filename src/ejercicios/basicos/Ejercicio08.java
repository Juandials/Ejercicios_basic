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
public class Ejercicio08 {
    public void operacion(){
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese base: ");
        a = sc.nextFloat();
        System.out.println("Ingrese altura: "); 
        b = sc.nextFloat();
         System.out.println("Area = " + ((a*b)/2));
        
    }
    
}
