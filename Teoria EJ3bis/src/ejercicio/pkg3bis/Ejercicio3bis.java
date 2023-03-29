/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3bis;

import java.util.Scanner;


public class Ejercicio3bis {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor correspondiente de la nota");
        int nota = leer.nextInt();
        
        
        while (nota<0 || nota >10) {
            
            System.out.println("El valor ingresado para la nota no es válido, vuelva a ingresar otro valor");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println("Ingrese el valor correspondiente de la nota");
            nota = leer.nextInt();
            
        }
            
            System.out.println("El valor ingresado para la nota es correcto"); 
    }
         
     
            
}
