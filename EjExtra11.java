/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op, resultado = 0, num1, num2;
        String op2="n";
       
        System.out.println("Ingrese número 1: ");
            num1 = leer.nextInt();
            System.out.println("Ingrese número 2: ");
            num2 = leer.nextInt();
        
        do {
            op2="n";
            
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción.");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    resultado = num1 / num2;
                    break;
                case 5:
                    System.out.println("¿Está\n seguro que desea salir del programa (S/N)?");
                    op2 = leer.next();                                                        
                        break;                                    
                default:
                    System.out.println("La opción ingresada no existe.");
                    break;
            }
            System.out.println("Resultado: " + resultado);
        } while (op2.charAt(0)=='n');

    }
}
