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
    public static void main(String[] args){
    
        Scanner s=new Scanner(System.in);
        
        int mesElegido;
        String[] meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
                
        System.out.println("Introduce el número del mes");
        mesElegido=s.nextInt();
        
        //Lo hacemos con un switch
        
        switch(mesElegido){
            case 4,6,9,11 ->{
                System.out.println("El mes elegido es "+meses[mesElegido-1]+" y tiene 30 días");
                break;
            }
            
            case 2 ->{
                System.out.println("El mes elegido es "+meses[mesElegido-1]+" y tiene 28 días");
                break;
            }
            
            default ->{
                System.out.println("El mes elegido es "+meses[mesElegido-1]+" y tiene 31 días");
            }
        }
        
        
        
        /*
        if(mesElegido==2) {
            System.out.println("El mes elegido es febrero y tiene 28 días");
            
        }
        
        if(mesElegido!=2){
            for (int i=0;i<dias30.length-1;i++){
                if(dias30[i].equals(meses[mesElegido-1])){
                    System.out.println("El mes elegido es "+meses[mesElegido-1]+" y tiene 30 días");
                    break;
                }else{
                    System.out.println("El mes elegido es "+meses[mesElegido-1]+" y tiene 31 días");
                    break;
                }
                
            }
        }
    */
        
        
    }
}
