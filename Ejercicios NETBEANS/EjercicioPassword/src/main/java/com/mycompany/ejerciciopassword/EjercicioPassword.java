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
    private static Password[] copia;
    
    public static void main(String[] args){
        
        lista=crearLista();
        copia=crearCopia();
        
        llenarArray();
        copiaPass();
        System.out.println("El password 6 de la lista es: "+lista[5].getPassword());
        System.out.println("El password 6 de la copiaes: "+copia[5].getPassword());
        mostrarCopia();
        
       
        
    }
    
    public static Password[] crearLista(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Dime el tamaño del array de contraseñas");
        lista= new Password[s.nextInt()]; //array creado 
        
        return lista;
         
    }
    
    public static Password[] crearCopia(){
        copia= new Password[lista.length]; //array creado 
        
        return copia;
    }
    
    public static void llenarArray(){
        Scanner s = new Scanner(System.in);
        System.out.println("Longitud del password");
        int longitud=s.nextInt();
        
        
        for (int i=0;i<lista.length;i++){
            lista[i]=new Password(longitud);
            
            System.out.println("El password "+i+" es: "+lista[i].getPassword());
        }
    }
    
    public static void copiaPass(){
        for (int i=0;i<lista.length;i++){
        copia[i]=new Password(lista[i]);
        }
        for (int i = 0; i < copia.length - 1; i++) {
        for (int j = 0; j < copia.length - 1 - i; j++) {
            // Cambia el criterio según lo que quieras ordenar
            if ((int)(copia[j].getPassword().charAt(0))>(int)((copia[j+1].getPassword().charAt(0)))) {
                // Intercambio
                Password aux = copia[j];
                copia[j] = copia[j + 1];
                copia[j + 1] = aux;
            }
        }
        }
    }
    
    public static void mostrarCopia(){
        for (int i=0;i<copia.length;i++){
            System.out.println("El password "+i+" es: "+copia[i].getPassword());
        }
    }
    
}


