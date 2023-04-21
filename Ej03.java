/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej01;

/**
 *
 * @author crist
 */
public class Ej03 {
    public static void main(String[] args){
        
        int num1 = 5;
        int num2 = 2;
        int suma = num1 + num2;
        
        double division = (double)num1 / num2;
        boolean bandera = num2 > num1;    
        num1++;
        
        System.out.println("A: "+num1+" y B: "+num2);
        System.out.println("La suma de A+B es: "+suma);
        System.out.println("La división de A/B es: "+division);
        System.out.println("Bandera: "+bandera);
        System.out.println("A+1 es: "+num1);
    }
    
}
