
package ejercicios.basicos;


public class Ejercicio58 {
    public void operacion(){
        int[] pares = new int[40];
        int n=1,ac=0;
        System.out.println("Los 20 primeros numeros pares son: ");
        for (int i=0; i<40; i++){
            pares[i] = n=n+1;
            if(pares[i]%2==0){
                System.out.println(pares[i]);
                ac=ac+pares[i];
            }
        }
        System.out.println("La suma es: " + ac);
    }
    
}
