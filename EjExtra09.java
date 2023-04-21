/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba una frase: ");
        String frase = leer.nextLine();

        String letraA = frase.substring(0, 1);
        
        System.out.println(letraA);
        
        if (letraA.equals("A")) {
            System.out.println("Correcto!");

        } else {
            System.out.println("Incorrecto!");
        }

    }
}
