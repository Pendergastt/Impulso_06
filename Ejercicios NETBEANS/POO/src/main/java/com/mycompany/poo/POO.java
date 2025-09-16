/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

/**
 *
 * @author Imp_06 - Mañana
 */
public class POO {
    

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("rojo",4);
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo();
        Vehiculo v3 = new Vehiculo("Naranja","4512JKL");
        
        System.out.print("El coche V es "); v.mostrarColor();
        System.out.print("El coche v1 es "); v1.mostrarColor();
        System.out.print("El coche v2 es "); v2.mostrarColor();
        System.out.print("El coche v3 es "); v3.mostrarColor(); v3.mostrarMatricula();
        
    }
}