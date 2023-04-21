/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej01;
import java.util.Scanner;
/**
 *
 * @author crist
 */
public class Ej05 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Con esta clase guardamos valores ingresados por consola en las variables.");
        System.out.println("Ingresa tu nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int edad = leer.nextInt();
        
        System.out.println("El nombre ingresado es: "+nombre);
        System.out.println("La edad ingresada es: "+edad);
       
    }
}
