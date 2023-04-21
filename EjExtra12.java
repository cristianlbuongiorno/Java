/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String FDE = "&&&&&";
        int correcta = 0, incorrecta = 0;
        String cadena;
        do {
            System.out.println("Ingresa una cadena de hasta 5 caracteres: ");
            cadena = leer.nextLine();
            cadena = cadena.toUpperCase();

            if (cadena.equalsIgnoreCase(FDE)) {
                break;
            }
            if (cadena.startsWith("X") && cadena.endsWith("O") && cadena.length() <= 5) {
                correcta++;

            } else {
                incorrecta++;
            }

        } while (!cadena.equalsIgnoreCase(FDE));
        System.out.println("Correctas: " + correcta);
        System.out.println("Incorrectas: " + incorrecta);

    }
}
