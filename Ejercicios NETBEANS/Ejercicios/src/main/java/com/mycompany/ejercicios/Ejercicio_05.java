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
public class Ejercicio_05 {
    public static void main(String[] args){
    
    Scanner s=new Scanner(System.in);
    
    //Switch
    
    System.out.println("Introduce una letra 'a', 'b', o 'c'");
    var letra=s.nextLine();
    switch (letra){
        case "a"->{
            System.out.println("Número 7");
        }
        case "b"->{
            System.out.println("Número 9");
        }
        case "c"->{
            System.out.println("Número 101");
        }
        default -> {
            System.out.println("No es ninguna de las letras que te he dicho");
        }
    
    
    }
}
}
