/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author Imp_06 - Mañana
 */


import java.util.Scanner;

/**
 *
 * @author Imp_06 - Mañana
 */
    

public class Ejercicio_04 {
    
    public static void main(String[] args){
   
     String usuario="usuario1";
     String password="password1";
     Scanner s = new Scanner(System.in);
     int intentos=3;
     
     System.out.println("Bienvenido a la CIA.\nIntroduzca Usuario y Contraseña");
          
     do {
         //String u="";
         //String p="";
         
         System.out.println("Usuario");
         var u=s.nextLine();
         
         System.out.println("Password");
         var p=s.nextLine();
         
         if(u.equals(usuario) && p.equals(password)){
             System.out.println("ACCESO CONCEDIDO\n Bienvenido, Agente");
             break;
             
         }else{
             /*
             if(intentos==0){
                 System.out.println("Número te intentos límite alcanzado");
                 break;
             }else{
             
             */
                System.out.println("ACCESO DENEGADO\n Usuario o Password incorrectos.");
                intentos--;
                System.out.println("Te quedan "+intentos+" intentos");
                
                     //}
         }
         
     }while(intentos>0);
     if(intentos==0){System.out.println("NO TE QUEDAN INTENTOS.\n ACCESO DENEGADO");}
     
     
    
    }

}
