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
public class Ejercicio_08 {
    
    public static int pedirMes(){
        Scanner s=new Scanner(System.in);
        
        int mesElegido;
        
        do {
        System.out.println("Introduce el número del mes");
        mesElegido=s.nextInt();
        if(mesElegido<1 || mesElegido>12){
            System.out.println("Tienes que ser del 1 al 12");
        }
        }while (mesElegido<1 || mesElegido>12);
        
        return mesElegido-1;
                
    }
    
    public static void mostrarMes(int mes){
        
        final String[] MESES= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};

        switch(mes){
            case 4,6,9,11 ->{
                System.out.println("El mes elegido es "+MESES[mes]+" y tiene 30 días");
                break;
            }
            
            case 2 ->{
                System.out.println("El mes elegido es "+MESES[mes]+" y tiene 28 días");
                break;
            }
            
            default ->{
                System.out.println("El mes elegido es "+MESES[mes]+" y tiene 31 días");
            }
        }
        
    }
    
       
    public static void main(String[] args){
    
        int mesUsuario=pedirMes();
        mostrarMes(mesUsuario);
       
    }
}
