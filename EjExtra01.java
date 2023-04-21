/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();

        System.out.println("La suma de ambos números es: " + (num1 + num2));

    }
}
