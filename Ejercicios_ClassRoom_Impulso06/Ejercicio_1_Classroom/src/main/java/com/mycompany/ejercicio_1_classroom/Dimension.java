/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1_classroom;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Dimension {
    protected double alto;
    protected double ancho;
    protected double profundidad;
    
    //Constructores
    protected Dimension(double alto, double ancho, double profundidad){
        this.alto=alto;
        this.ancho=ancho;
        this.profundidad=profundidad;
    }
    
    protected Dimension(){
        this.alto=0;
        this.ancho=0;
        this.profundidad=0;
    }
    
     
    //Metodos
    
    public double getVolumen(){
        return this.ancho*this.alto*this.profundidad;
    }
    
    public String toString(){
        return "Estas son las dimensiones del objeto\nAlto: "+this.alto+"\nAncho: "+this.ancho+"\nProfundidad: "+this.profundidad+"\nVOLUMEN MAXIMO: "+this.getVolumen();
    }
    
}
