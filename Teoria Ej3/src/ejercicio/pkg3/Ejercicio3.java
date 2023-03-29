/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package ejercicio.pkg3;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor entre 0 y 10");
        int respuesta = leer.nextInt();
        String salir = "s";
       // salir = "s";
        boolean es = false;
        while(!es){
            if (respuesta>=0 && respuesta<=10){
                System.out.println("Su numero es correcto");
                //es=true;
                 System.out.println("desea continuar?");
            salir = leer.next();
            es = !salir.equalsIgnoreCase("s");
            if (!es){ 
                System.out.println("Ingrese un valor entre 0 y 10");
                respuesta = leer.nextInt();
            }
            
            }else{
                System.out.println("Vuelva agregar ");
                respuesta = leer.nextInt();
            }
          
        }
        
    }
    
}