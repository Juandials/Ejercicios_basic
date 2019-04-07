/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.basicos;

/**
 *
 * @author judil
 */
public class Ejercicio98 {
    public void operacion(){
       int arg=5, power=5; 
       factorial(arg);
//pow(arg,power);
        //System.out.println(arg+""+power);
    }
    public int pow(int x,int y){
        y=y-1;
        if(y==0){
            return x;
        }
        else{
          return x*x;  
        }
    }
    public int factorial(int n) {
      if (n == 0) {
            return 1;
      } else {
            return n * factorial(n - 1);
      }
}
}
