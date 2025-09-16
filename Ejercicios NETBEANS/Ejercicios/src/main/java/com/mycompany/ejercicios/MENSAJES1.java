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
public class MENSAJES1 {
    
    public static void saludar(String nombre){
        System.out.println("Hola "+nombre+", ¿qué tal?");
    }
    
    public static String usuario(){
        Scanner s= new Scanner(System.in);
        System.out.println("Dime tu nombre");
        return s.nextLine();
                
    }
    
    
    public static void main(String[] args){
     
        saludar(usuario());
    
     
     
     }
}
