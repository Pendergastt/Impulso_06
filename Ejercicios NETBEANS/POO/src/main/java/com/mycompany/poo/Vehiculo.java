/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Vehiculo {
    //Estamos creando los atributos de la clase Vehiculo. No definiendo nada del main ni tal. únicamente ATRIBUTOS de la clase.
//CONSTRUCTORES
    // Constructor por defecto
    public Vehiculo (){
        color="Blanco";
        nRuedas=4;
        matricula="SIN_MATRICULAR";
    }
    
    public Vehiculo(String color, int nRuedas){
        this.color=color;
        this.nRuedas=nRuedas;
    }
    
    public Vehiculo(String color, String matricula){
        this.color=color; // this hace referencia al color del objeto que estamos creando. 
        this.matricula=matricula;
    }

// ATRIBUTOS
    private String color;
    private int nRuedas;
    private String matricula;
    
   
    
//Métodos
    public void mostrarColor(){
        System.out.print("Este veículo es "+color);
    }
    
    public void mostrarMatricula(){
        System.out.print("La matrícula es "+matricula);
    }
    
    //GETTERS Y SETTTERS (hacer para usar)
}
