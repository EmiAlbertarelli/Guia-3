/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

 */
package ejercicio.pkg4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num, cont, suma;
       suma = 0;
        cont = 0;
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            cont = cont + 1;
            if(num>0){
                suma = (suma + num);
            }else {
                suma = suma + 0;
            }
         }while(num != 0 && cont < 20);
        if (num!=0) {
            System.out.println("La suma de los numeros ingresados es " + suma);
        }
        else {
            System.out.println("Se capturo el numero 0");
            System.out.println("La suma de los numeros ingresados es " + suma);    
        }            
        }
}
       
    

