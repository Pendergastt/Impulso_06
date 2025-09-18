/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopassword;

import java.util.Scanner;

/**
 *
 * @author Imp_06 - Mañana
 */
public class EjercicioPassword {
    
    // static es que no necesita constructor
    private static Password[] lista;
    
    public static void main(String[] args){
        
        lista=crearLista();
        llenarArray();
        System.out.println(lista[2].getPassword());
        System.out.println(lista[2].esFuerte(lista[2].getPassword()));
        
                
    }
    
    public static Password[] crearLista(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Dime el tamaño del array de contraseñas");
        lista= new Password[s.nextInt()] ; //array creado 
        
        return lista;
       
         
    }
    
    public static void llenarArray(){
        Scanner s = new Scanner(System.in);
        System.out.println("Longitud del password");
        int longitud=s.nextInt();
        
        
        for (int i=0;i<longitud;i++){
            lista[i]=new Password(longitud);
        }
    }
}

