/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Inrese el tiempo transcurrido en mintos: ");
        int min = leer.nextInt(), hs, dias;

        hs = (int) min / 60;
        if (hs < 24) {
            dias = 0;
        } else {
            dias = (int) hs / 24;
            if (!(hs % 24 == 0)) {
                hs = hs % 24;
            }
        }
        System.out.println(dias + " día/s, " + hs + " hora/s.");

    }
}
