/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprac6ari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int x1;
         int x2;
         int op;
    System.out.println("ingrese los valores con los cuales quiere trabajar");
    x1=sc.nextInt();
    x2=sc.nextInt();
    do {
        System.out.println("menu " +
                "\n1.sumar" +
                "\n2.restar" +
                "\n3.multiplicar" +
                "\n4.dividir" +
                "\n5.Salir" +
                "\nelejir una opcion");
        op=sc.nextInt();
        switch (op){
            case 1:
                System.out.println((x1+x2));
                break;
            case 2:
                System.out.println((x1-x2));
                break;
            case 3:
                System.out.println((x1*x2));
                break;
            case 4:
                System.out.println((x1/x2));
                break;
            case 5:
                System.out.println("seguro que desea salir  S/N");
                String op1;
                op1= sc.next();
                if (op1.equalsIgnoreCase("s")){
                    op=99;
                }
                break;
        }
    }while(op!=99);
    }
}