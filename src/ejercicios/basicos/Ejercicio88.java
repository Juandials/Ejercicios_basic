
package ejercicios.basicos;

import java.util.Scanner;


public class Ejercicio88 {
    
    public void operacion(){
        float a,b,c;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca la base de la potencia: ");
        a = sc.nextFloat();
        System.out.println("introduzca el exponente de la potencia: ");
        b = sc.nextFloat();
        c = potencia(a,b);
        System.out.println(c);
    }
    
    public float potencia(float a,float b){
        float i=0,c=1;
        while (i<b){
            c=c*a;
            i=i+1;
        }
        
        return c;   
    }
    
}
