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
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        String frase;
        String letra;
        int contador=0;
        
        System.out.println("Escribe una frase");
        frase=s.nextLine();
        System.out.println("Ahora dime una letra");
        letra=s.nextLine();
        
        for(int i=0;i<frase.length()-1;i++){
            if(frase.charAt(i)==letra.charAt(0)){
                contador++;
            }
        }
        
        System.out.println(contador);
    }
}
