/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra37 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de los vectores: ");
        int num1 = leer.nextInt();
        int num2 = num1, cont = 0;
        int[] vectorUno = new int[num1];
        int[] vectorDos = new int[num2];
        for (int i = 0; i < num1; i++) {
            System.out.println("Ingrese dos números: " + (i + 1));
            vectorUno[i] = leer.nextInt();
        }
        for (int i = 0; i < num2; i++) {
            System.out.println("Ingrese dos números: " + (i + 1));
            vectorDos[i] = leer.nextInt();
        }
        for (int i = 0; i < num1; i++) {

            if (vectorUno[i] == vectorDos[i]) {
                cont++;
            }

        }
        if (cont == num2) {
            System.out.println("Los vectores son iguales.");

        } else {
            System.out.println("Los vectores no son iguales.");
        }
    }
}
