/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra38 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] vector = new int[3];

        vector = llenar(vector);
        resultado(vector);
    }

    public static int[] llenar(int[] vector) {

        for (int i = 0; i < 3; i++) {
            vector[i] = (int) (Math.random() * 10);

        }
        return vector;
    }

    public static void resultado(int[] vector) {

        for (int i = 0; i < 3; i++) {
            System.out.println("[" + vector[i] + "]");

        }
    }
}
