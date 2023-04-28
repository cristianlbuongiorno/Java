/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package javaintroej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtra39 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int notas, alumnos, aprobados, desaprobados, nota1, nota2, nota3, nota4, cont = 0;

        double[] promedio = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese su primera nota: ");
            nota1 = leer.nextInt();
            System.out.println("Ingrese su segunda nota: ");
            nota2 = leer.nextInt();
            System.out.println("Ingrese su tercera nota: ");
            nota3 = leer.nextInt();
            System.out.println("Ingrese su cuarta nota: ");
            nota4 = leer.nextInt();

            promedio[i] = (double) (nota1 * 0.1) + (nota2 * 0.15) + (nota3 * 0.25) + (nota4 * 0.50);

        }
        for (int i = 0; i < 3; i++) {
            System.out.println("El pormedio del alumno de " + (i + 1) + " es: " + promedio[i]);
        }
        for (int i = 0; i < 3; i++) {
            if (promedio[i] >= 7) {
                cont++;

            }

        }
        System.out.println("Los alumnos aprobados fueron: " + cont);
        System.out.println("Los alumnos reprobados fueron: " + (3 - cont));
    }
}
