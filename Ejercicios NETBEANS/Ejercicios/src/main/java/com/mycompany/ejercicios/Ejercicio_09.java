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
public class Ejercicio_09 {
    public static void main(String[] args){
        
        Scanner s= new Scanner(System.in);
        
        int numCeros=0;
        int numNegativos=0;
        int numIntroducido;
        
        System.out.println("Ve introduciendo números enteros, por favor. Para parar, introduce '-25'. Comenzamos");
        
        do{
            System.out.println("Introduce un número");
            numIntroducido=s.nextInt();
            if(numIntroducido<0){
                numNegativos++;
            }
            if(numIntroducido==0){
                numCeros++;
            }          
        }while(numIntroducido!=-25);
        
        System.out.println("El número de ceros introducidos ha sido "+numCeros);
        System.out.println("El número de números negativos introducidos ha sido "+numNegativos);
        
        
    
    
    }
}
