/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de su vector: ");
        int n = leer.nextInt();
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * n);

        }

        for (int i = 0; i < n; i++) {
            if (vector[i] < 10) {
                c1++;
            }
            if (vector[i] > 9 && vector[i] < 100) {
                c2++;
            }
            if (vector[i] > 99 && vector[i] < 1000) {
                c3++;
            }
            if (vector[i] > 999 && vector[i] < 10000) {
                c4++;
            }
            if (vector[i] > 9999 && vector[i] < 100000) {
                c5++;
            }
            {

            }
            System.out.println("");
        }
        System.out.println("En el vector hay " + c1 + " números de una cifra.");
        System.out.println("En el vector hay " + c2 + " números de dos cifras.");
        System.out.println("En el vector hay " + c3 + " números de tres cifras.");
        System.out.println("En el vector hay " + c4 + " números de cuatro cifras.");
        System.out.println("En el vector hay " + c5 + " números de cinco cifras.");
    }

}
