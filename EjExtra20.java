/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cuantas filas desea en su cuadrado mágico: ");
        int fila = leer.nextInt();
        System.out.println("Ingresa la misma catidad de columnas que filas: ");
        int colum = leer.nextInt();

        int[][] matriz = new int[fila][colum];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Ingrese los números conrespondientes para columnas y filas, comenzando con fila una columna uno, fila uno columna dos, etc.: ");
                matriz[i][j] = leer.nextInt();

            }

        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(matriz[i][j]);
            }
        }

    }
}
