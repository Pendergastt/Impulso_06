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
public class Ejercicio_07 {
    public static void main(String[] args){
    
        Scanner s= new Scanner(System.in);
        
        int hor;
        int min;
        int sec;
              
        System.out.println("Hola. Introduce una hora, unos minutos y unos segundos");
        
        /*
        System.out.println("Introduce un valor para la HORA");
        
        hor=s.nextInt();
        
        do{
            System.out.println("No es una hora correcta. Pon otra hora");
            hor= s.nextInt();
            
        }while(hor<0 || hor>24);
        
        
        System.out.println("Ahora pon los minutos");
        
        min=s.nextInt();
                
        do{
            System.out.println("No es una hora correcta. Pon otros minutos");
            min= s.nextInt();
            
        }while(min<0 || min>60);
        
        System.out.println("Ahora pon los minutos");
        
        sec=s.nextInt();
        
        do{
            System.out.println("No es una hora correcta. Pon otros segundos");
            sec= s.nextInt();
            
        }while(sec<0 || sec>60);
    */
        System.out.println("Pon una hora");
        hor=s.nextInt();
        System.out.println("Pon unos minutos");
        min=s.nextInt();
        System.out.println(min);
        System.out.println("Pon unos segundos");
        sec=s.nextInt();
        
        if((hor<0 || hor>=24) || (min<0 || min >=60) || (sec<0 || sec>=60)){
            System.out.println("Formato Incorrecto");
        }else{System.out.println("Formato Correcto");
        
        }
        
        
    
    }
}
