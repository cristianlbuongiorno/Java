/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package javaintroej01;

/**
 *
 * @author crist
 */
public class EjExtra15 {

    public static void main(String[] args) {
        
        int[] num = new int[100];
        for (int i = 0; i <= 99; i++) {
            num[i] = i + 1;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
