/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Ejercicio_02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String frase;
        char letra;
        int contador = 0;
        String indicadores="";

        System.out.println("Escribe una frase");
        frase = s.nextLine();
        System.out.println("Ahora dime una letra");
        letra = s.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                indicadores=indicadores+"^";
                contador++;
            }else{
                indicadores=indicadores+" ";
            }
        }
        
        System.out.println(contador);
                System.out.println(frase);
                System.out.println(indicadores);
    }
}
