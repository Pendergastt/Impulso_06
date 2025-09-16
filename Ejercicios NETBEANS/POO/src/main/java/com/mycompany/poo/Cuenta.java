/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta(String titular, int cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
    }
    
    //GETTER
    public String getTitular(){
        return titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    
    //SETTER
    public void setTitular(String titular){
        this.titular=titular;
    }
    
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }
    
    //toString
    
    @Override
    public String toString(){
        return "La cuenta pertenece a "+titular+" y contiene"+cantidad+" euros.";
    }
    
}
