/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int valorLimite, suma = 0, num;

        System.out.println("Ingrese un número máximo: ");
        valorLimite = leer.nextInt();

        while (suma < valorLimite) {
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            suma = suma + num; //suma+=num

            System.out.println(suma);
        }

    }
}
