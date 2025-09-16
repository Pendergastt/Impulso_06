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
public class Ejercicio_03 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        int n1;
        int n2;
        String seleccion="";
        
        System.out.println("¿Qué quieres hacer?\n 1.- Sumar\n 2.- Restar\n");
        seleccion=s.nextLine();
        switch(seleccion){
            case "1" -> {
                System.out.println("Dime el primer número");
                n1=s.nextInt();
                System.out.println("Ahora dime el segundo número");
                n2=s.nextInt();
                System.out.println("La SUMA de los dos números es "+(n1+n2));
            }
            case "2" -> {
                System.out.println("Dime el primer número");
                n1=s.nextInt();
                System.out.println("Ahora dime el segundo número");
                n2=s.nextInt();
                System.out.println("La RESTA de los dos números es "+(n1-n2));
            }
        }
        
    }
}
