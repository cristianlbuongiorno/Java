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
public class Ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String lectura;
        String retorno;
        //String frase = "";
        //String fraseCod = "";

        System.out.println("Ingrese una letra, palabra o caracter");
        lectura = leer.nextLine();
        lectura = lectura.toLowerCase(); //toLowerCase es para pasar todo a minusculas
        retorno = codificar(lectura);
        System.out.println(retorno);
    }

    //subprograma para codificar la frase
    public static String codificar(String lectura) {
        String vocales;
        String fraseCod;
        String caracterVocales;
        String caracterCadena;
        int cont;
        vocales = "aeiou"; //vocales sirve para recorrer la frase e identificar las coincidencias con las vocales que contiene
        fraseCod = "";

        for (int i = 1; i <= lectura.length(); i++) {
            cont = 0;
            caracterCadena = lectura.substring(i - 1, i);

            for (int j = 1; j <= vocales.length(); j++) {
                caracterVocales = vocales.substring(j - 1, j);
                if (caracterCadena.equals(caracterVocales)) {
                    cont = 1;
                    switch (caracterVocales) {
                        case "a":
                            fraseCod = (fraseCod.concat("@"));
                            break;
                        case "e":
                            fraseCod = (fraseCod.concat("#"));
                            break;
                        case "i":
                            fraseCod = (fraseCod.concat("$"));
                            break;
                        case "o":
                            fraseCod = (fraseCod.concat("%"));
                            break;
                        case "u":
                            fraseCod = (fraseCod.concat("*"));
                            break;

                        //caso contrario lo escriba tal cual es
                        default:
                            fraseCod = fraseCod + caracterCadena;
                    }
                }
            }
            if (cont == 0) {
                fraseCod = fraseCod.concat(caracterCadena);
            }
        }
        return fraseCod;

    }
}
