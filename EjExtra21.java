/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 10);
                System.out.print("|" + matrizM[i][j] + "|");

            }
            System.out.println("");
        }
        System.out.println("---------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = (int) (Math.random() * 10);
                System.out.print("|" + matrizP[i][j] + "|");
            }
            System.out.println("");
        }

        boolean encontrada = false;
        //Acá iniciamos el recorrido de la matrizM y MatrizP hasta la columna 7, ya que en la 8 ya no habra una matriz 3x3.
        for (int i = 0; i <= matrizM.length - matrizP.length && !encontrada; i++) {
            for (int j = 0; j <= matrizM[0].length - matrizP[0].length && !encontrada; j++) {
                boolean coincide = true;
                //Acá iniciamos la busqueda de coincidencias.
                for (int k = 0; k < matrizP.length && coincide; k++) {
                    for (int l = 0; l < matrizP[0].length && coincide; l++) {
                        if (matrizP[k][l] != matrizM[i + k][j + l]) {
                            coincide = false;

                        }

                    }

                }
                if (coincide) {
                    encontrada = true;
                    System.out.println("La matriz P está contenida en la matriz M.");
                    System.out.println("La submatriz empieza en la fila " + i + " y la columna " + j + " de la matriz M.");

                }

            }

        }
        if (!encontrada) {
            System.out.println("La matriz P no está contenida en la matriz M.");

        }

    }

}