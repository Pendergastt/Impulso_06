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
     String aux;
     String p1;
     String p2;
     
    
     for (int i=0;i<palabras.length;i++){
        
         for(int j=1;j<palabras.length-i;j++){
             if(palabras[j].compareTo(palabras[j-1])<=0){
                 aux=palabras[j-1];
                 palabras[j-1]=palabras[j];
                 palabras[j]=aux;
             }
             
         }
         
     }
     
     for (int i=0;i<palabras.length;i++){
         System.out.println(palabras[i]);
        }
     
     //compareTo lo hace respecto al unicode. suma las letras y luego compara ese numero (o no)
     String s1="da";
     String s2="dc";
     int comparado=s1.compareTo(s2);
     System.out.println("comparado es "+comparado);
     
    }
}


// Coge pares dos a dos y lo reordena
// Hay que mirar una posicion y otra, X VECES.