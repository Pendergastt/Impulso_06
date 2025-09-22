/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    public static final double PRECIO_BASE=100;
    public static final String COLOR_BASE="Blanco";
    public static final char CONSUMO_BASE='F';
    public static final double PESO_BASE=5;



    public Electrodomestico() {
        precioBase = PRECIO_BASE;
        color=COLOR_BASE;
        consumoEnergetico=CONSUMO_BASE;
        peso=PESO_BASE;      
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        color = COLOR_BASE;
        consumoEnergetico = CONSUMO_BASE;
    }

    //constructor de copia
    public Electrodomestico(Electrodomestico e) {
        this.precioBase = e.precioBase;
        this.peso = e.peso;
        this.color = e.color;
        this.consumoEnergetico = e.consumoEnergetico;
    }


    
}
