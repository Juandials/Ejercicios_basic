
package ejercicios.basicos;

import java.util.Scanner;

public class Ejercicio46 {
    
    public void operacion(){
        float a=0,n,m;
        System.out.println("Digite la cantidad de numeros que va a ingresar");
        Scanner sc = new Scanner (System.in);
        m= sc.nextFloat();
        
        for (int i=0 ;i<m; i++){
            System.out.println("ingrese el numero "+ (i+1)+ " de la media");
            n = sc.nextFloat();
            a=(a+n);
        }
        System.out.println("La media es: " + (a/m));
    } 
    
}
