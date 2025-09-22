/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_1_classroom;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Ejercicio_1_Classroom {

    public static void main(String[] args) {
        System.out.println("Modelos superheroes");
        SuperHeroe spiderman=new SuperHeroe("Peter Parker");
        System.out.println(spiderman.toString());
        
        Dimension cosa=new Dimension(10,20,5);
        System.out.println(cosa.toString());
        
        Figura fig=new Figura("Juan",10,10,10,"23mb",23);
        System.out.println(fig.getPersonaje().toString());
        //System.out.println(fig.toString());
        System.out.println(fig.toString());
        
        
        
    }
    
    
}
