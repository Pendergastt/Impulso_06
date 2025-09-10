/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Ejercicio_06 {
    public static void main(String[] args){
    
        String[] palabras={"silla","mesa","zapato","camiseta","almohada","tomahawk","repetidor"};
        /*
        System.out.println("Las palabras que vamos a ordenar son:");
        
        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
        */
     String control;
     String p1;
     String p2;
     
     for (int i=0;i<palabras.length-1;i++){
        
         for(int j=0;j<palabras.length-1;j++){
             if(palabras[j].compareTo(palabras[j+1])<=0){
                 control=palabras[j];
                 palabras[j]=palabras[j+1];
                 palabras[j+1]=control;
                         //REPETIR EN CASA
             }
             
         }
         
         
         
         
     System.out.println(palabras[i]);
     }
         
    }
}
