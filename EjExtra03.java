/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        System.out.println("La frase ingresada en minúsculas es: " + frase.toLowerCase());
        System.out.println("La frase ingresada en mayúsculas es: " + frase.toUpperCase());
    }
}
