   
package ejercicios.basicos;

import java.util.Scanner;


public class Ejercicio52 {
    public void operacion(){
        int a,ac=0,r=1,n=1;
        while (r<=10){
            System.out.println("Ingresse un numero: ");
            Scanner sc = new Scanner(System.in);
            a= sc.nextInt();
            if (a<0){
                ac=ac+a;  
            }
             r=r+1;
        }
        System.out.println("La suma de los numeros negativos es: "+ ac);
    }
    
}
