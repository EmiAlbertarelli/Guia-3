/*
 Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.

 */
package ejercicio.pkg1;

import java.util.Scanner;


public class Ejercicio1 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num, num2; 
       System.out.println("Ingrese dos valores");
       num = leer.nextInt();
       num2 = leer.nextInt();
       
        
        if(num >25 && num2>25){
            System.out.println("Los numeros son mayor a 25");
            
        }else if(num>25 || num2>25){
            System.out.println("Uno de los numeros es mayor a 25");
        }
    
}
}
