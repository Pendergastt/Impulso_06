/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Moto extends Vehiculo{
    private boolean licencia;

    public Moto() {
        super();
        this.licencia = false;
    }

    @Override
    public String toString() {
        String resultado= super.toString()+"\nLicencia: "+licencia;
        return resultado;
    }
    
    
}
