/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_interface;

/**
 *
 * @author pendd
 */
public class PersonalAdmin extends Persona{
    String departamento;

    public PersonalAdmin(String departamento, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.departamento = departamento;
    }

       
    
}
