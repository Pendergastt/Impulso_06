/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Vehiculo {
    private int ejes;
    /* 
    **Este atributo privado es para cosas qe en un momento concreto pueden dars epero no quieres que hereden
    Por ejemplo, si alguna vez has tenido que hacer un camión pero no es lo general, lo construyes con los ejes como vehículo
    pero no tienes que crear una calse para camion.
    */
    
    protected String color;
    protected int nRuedas;
    protected String tipoMotor;
    protected String matricula;
    
    //Contsructores
    //defecto
    public Vehiculo(){
        color="Blanco";
        nRuedas=0;
        tipoMotor="Sin tipo";
        matricula="Sin matricular";
    }
    
}
