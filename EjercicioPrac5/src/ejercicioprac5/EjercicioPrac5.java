/*
 Escriba un programa en el cual se ingrese un valor limite positivo, 
y a continuacion solicite numeros al usuario hasta que la suma 
de los numeros introducidos supere el limite inicial.

 */
package ejercicioprac5;

import java.util.Scanner;


public class EjercicioPrac5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int valpos;
        int suma=0;
           
        System.out.println("Ingrese un valor limite");
        valpos = leer.nextInt();
        
       do {
           System.out.println("Ingrese un numero");
           num = leer.nextInt();
           suma += num;
       }while (suma<=valpos);
    }
    
}
