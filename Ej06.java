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
public class Ej06 {
    public static void main(String[] args){
     Scanner leer = new Scanner(System.in);  
     
     int num1;
     int num2;            
     
        System.out.println("Ingrese un número entero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese otro número entero: ");
        num2=leer.nextInt();
        
        if ((num1 > 25) || (num2 > 25)){
            System.out.println("Alguno de los números es mayor que 25.");
                }
        else{
            System.out.println("Ningún número es mayor a 25.");
            
            }
            
        }
         }
    



