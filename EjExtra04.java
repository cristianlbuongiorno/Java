/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la temperatura actual en grados Centígrados: ");
        double grados = leer.nextDouble();

        double faren = 32 + (9 * grados / 5);

        System.out.println("La temperatura ingresada en grados Fahrenheit es: " + faren);

    }
}
