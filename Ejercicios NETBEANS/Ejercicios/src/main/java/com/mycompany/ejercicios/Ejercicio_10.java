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
public class Ejercicio_10 {
    public static void main(String[] args){
    
        Scanner s=new Scanner(System.in);
        
        System.out.println("Introduce un número positivo cualquiera");
               
    int n=s.nextInt();
    
    while(n>0){
        
        System.out.print(n%10);
        n=n/10;
        
    }
    
    }
}
