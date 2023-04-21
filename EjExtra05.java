/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int num1 = leer.nextInt();

        double raiz = Math.sqrt(num1);

        System.out.println("El doble de ese número es: " + num1 * 2);
        System.out.println("El triple de ese número es: " + num1 * 3);
        System.out.println("La raíz cuadrada de ese número es: " + raiz);

    }
}
