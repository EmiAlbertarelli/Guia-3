/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.

 */
package ejerprac2;

import java.util.Scanner;


public class EjerPrac2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase; 
        String palabra = "eureka";
       
        System.out.println("Ingrese una palabra");
        frase = leer.nextLine();
         if(frase.equals(palabra)){
             System.out.println("Correcto");
         }else {
             System.out.println("Incorrecto");
         }
    }
    
}
