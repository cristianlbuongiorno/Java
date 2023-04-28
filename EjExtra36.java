/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra36 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, suma = 0;
        System.out.println("Ingrese el tamaño de su vector: ");
        num = leer.nextInt();
        int[] vector = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el valor: " + (i + 1));
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        System.out.println("La suma total es " + suma);
    }
}
