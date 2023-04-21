/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] vector = new int[10];
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("Qué número desea buscar del 0 al 10?");
        int num = leer.nextInt();

        boolean encontrado = true;
        boolean repetido = true;

        for (int i = 0; i < 10; i++) {
            if (vector[i] == num) {
                System.out.println("El número " + num + " se encuentra en la posición " + vector[i] + " del vector.");
                encontrado = false;
            } else if (vector[i] == num + 1) {
                System.out.println("El número " + num + " se encuentra repetido en el vector.");
                repetido = false;
            } else {
                System.out.println("El número " + num + " no se encuentra en el vector.");
                break;
            }
        }
    }
}
