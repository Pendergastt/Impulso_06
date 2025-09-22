/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1_classroom;

/**
 *
 * @author Imp_06 - Mañana
 */
public class SuperHeroe {

    protected String nombre;
    protected String descripcion;
    protected boolean capa;

    public SuperHeroe() {
       this.nombre="";
       this.descripcion="";
       this.capa=false;
    }
    
    /*
    
    public SuperHeroe(String nombre, String descripcion, boolean capa){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.capa=capa;
    }

    */
    
    public SuperHeroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDescripcion(){
        return this.descripcion;
        
    }
    
    public boolean getCapa(){
        return this.capa;
    }
    
    public String toString(){
        if(this.capa==false) return "El héroe se llama"+this.nombre+"\n--DESCRIPCIÓN--\n"+this.descripcion+"\nY NO lleva capa";
        else return  "El héroe se llama "+this.nombre+"\n--DESCRIPCIÓN--\n"+this.descripcion+"\nY SÍ lleva capa";
    }

}
