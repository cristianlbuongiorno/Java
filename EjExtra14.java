/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double euros, dolar = 1.28611, yen = 129.852, libra = 0.86;
        int opcion, divisa;

        System.out.println("Ingrese cuantos Euros desea convertir: ");
        euros = leer.nextDouble();

        do {
            System.out.println("A que divisa desea convertirlo?");
            System.out.println("1. Dolares");
            System.out.println("2. Yenes");
            System.out.println("3. Libras");
            divisa = leer.nextInt();

            switch (divisa) {

                case 1:
                    System.out.println(euros * dolar);
                    break;
                case 2:
                    System.out.println(euros * yen);
                    break;
                case 3:
                    System.out.println(euros * libra);
                    break;
                default:
                    System.out.println("Divisa no admitida.");
                    break;
            }
            System.out.println("Si desea realizar otra conversión presione 1, de lo contrario 2.");
            opcion = leer.nextInt();
        } while (opcion == 1);
        System.out.println("Gracias por utilizar nuestro conversor.");
    }

}
