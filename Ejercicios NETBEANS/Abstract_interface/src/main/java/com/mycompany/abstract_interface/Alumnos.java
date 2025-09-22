/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_interface;

/**
 *
 * @author pendd
 */
public class Alumnos extends Persona{
    private String nExpediente;
    private double[] notas;

    public Alumnos(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    public Alumnos(String nombre, String apellido, String dni,String nExpediente) {
        super(nombre, apellido, dni);
        this.nExpediente = nExpediente;
    }

    public Alumnos(String nombre, String apellido, String dni, double[] notas) {
        super(nombre, apellido, dni);
        this.notas = notas;
    }

 
    
    
    
}
