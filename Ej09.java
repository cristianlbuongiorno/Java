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
public class Ej09 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
     
     int num;
     int suma = 0;
     int contador = 0;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
     
     do {
        contador ++; //Incrementamos el contador
        //contador = contador + 1;
        //contador += 1;
        if(num > 0){
            suma = suma + num;
            //suma += num;
        } else if (num == 0){
            break;
        }
        
        System.out.println("Ingrese otro numero");
        num = leer.nextInt();
        
     } while (contador < 20);
        //while (contador <= 19);
        //while (contador <= 20-1);
        
        if(num == 0){
            System.out.println("El ultimo numero ingresado fue 0");
        } else {
            System.out.println("Salio del bucle por haber leido 20 numeros");
        }
        System.out.println("El resultado de suma es:"+suma);        
  }
}

/*
Scanner leer= new Scanner(System.in);
         int cont=0,suma=0;
        do {
            System.out.println("ingrese sus numeros");
           int num = leer.nextInt();
           if (num > 0) {
               suma+=num;
           }
           if (num == 0){
               break;
           }
            cont++;  
            
    }while(cont != 20);
        System.out.println("la suma de los números es "+ suma);

Otro modo de implementarlo.
*/