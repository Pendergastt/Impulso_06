/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_interface;

/**
 *
 * @author pendd
 */
public class Profesor extends Persona {
    private double sueldo;
    private String email;

    public Profesor(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        email="sin mail aun";
    }

    public Profesor(String nombre, String apellido, String dni,double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }

    public Profesor( String nombre, String apellido, String dni,String email) {
        super(nombre, apellido, dni);
        this.email = email;
    }
    
    

  
    
}
