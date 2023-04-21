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
public class Ej08 {
    public static void main(String[] args){
     Scanner leer = new Scanner(System.in);
     int nota;
        
        System.out.println("Ingresa su nota: ");
        nota=leer.nextInt();
        
        while   (!(nota  >= 0 && nota <= 10)){
            System.out.println("Su nota no está dentro del rango, por favor ingrese denuevo.");
            System.out.println("Ingresa su nota: ");
            nota=leer.nextInt();
          }  
            System.out.println("Tu nota es: "+nota);
        }
   }  
