/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú. El programa 
deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario 
selecciona la opción 5, en vez de salir del programa directamente, se debe 
mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del 
programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.


 */
package ejercicioprac6;

import java.util.Scanner;

public class EjercicioPrac6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, num2, opcion;
       // String letra ;
        boolean Salir = false;
        double divi;

        do {
            System.out.println("Ingrese 2 numeros positivos");
            num = leer.nextInt();
            num2 = leer.nextInt();

        } while (num <= 0 || num2 <= 0);

        do {
            
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("El resultado de la suma es: " + (num + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es: " + (num * num2));
                    break;
                case 4:
                    divi = (num / num2);
                    System.out.println("El resultado de la division es: " + divi);
                    break;
                case 5:
                    System.out.println("Desea salir realmente s/n");
                    String letra;
                    letra = leer.next();
                    if (letra.equalsIgnoreCase("s")){
                    opcion=99;
                }
                    break;
                
            }
        } while (opcion!=99);
    }
}
