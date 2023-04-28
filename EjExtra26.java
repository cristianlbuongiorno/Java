/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String plan;
        int cont = 0;

        do {
            System.out.println("Ingrese su plan: A, B, C: ");
            plan = leer.nextLine();

            switch (plan) {
                case "a":
                    cont++;
                    break;
                case "b":
                    cont++;
                    break;
                case "c":
                    cont++;
                    break;
                case "A":
                    cont++;
                    break;
                case "B":
                    cont++;
                    break;
                case "C":
                    cont++;
                    break;
            }
            if (cont == 0) {
                System.out.println("El plan ingresado no es válido.");

            }

        } while (cont == 0);

        System.out.println("Ingrese el costo de su tratamiento: ");
        int valor = leer.nextInt();

        double descuentoA = valor * 0.5, descuentoB = valor * 0.35;

        if (plan.equalsIgnoreCase("a")) {
            System.out.println("PLAN A %50 OFF: Valor del tratamiento $" + (valor - descuentoA));

        } else if (plan.equalsIgnoreCase("b")) {
            System.out.println("PLAN B %35 OFF: Valor del tratamiento $" + (valor - descuentoB));

        } else if (plan.equalsIgnoreCase("c")) {
            System.out.println("PLAN C no dispone de descuentos: Valor del tratamiento $" + valor);

        }
    }
}
