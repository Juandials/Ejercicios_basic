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
public class Ejercicio66 {
    public static void operacion() {
           
    int x [][] = {{5, 6, 13}, {14, 2, 4}, {21, 7, 6}};  
    int columna = x[0].length;
    int fila=x.length;
    for(int i = 0; i < fila; i++){
        for(int j = 0; j < columna; j++){
            x[i][j] = x[i][j]*2;
        }
    }
    
    }
}
          
    
