/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1_classroom;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Figura {
    public SuperHeroe personaje;
    public Dimension tamaño;
    public String codigo;
    public double precio;

    public Figura(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }
    
   public Figura(String nombre, double alto, double ancho, double profundidad, String codigo, double precio){
       this.personaje = new SuperHeroe(nombre);
       this.tamaño = new Dimension(alto, ancho, profundidad);
       this.codigo=codigo;
       this.precio=precio;
       
   }
   
   public Figura(){
       this.personaje=new SuperHeroe();
   }

    public SuperHeroe getPersonaje() {
        return personaje;
    }

    public void setPersonaje(SuperHeroe personaje) {
        this.personaje = personaje;
    }

    public Dimension getTamaño() {
        return tamaño;
    }

    public void setTamaño(Dimension tamaño) {
        this.tamaño = tamaño;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String toString(){
        return "El personaje se llama "+personaje.getNombre()
        +", su descripcion es "+personaje.getDescripcion()+"la capa es "+personaje.getCapa()+", el volumen es "+tamaño.getVolumen()+". El cogido es "+this.codigo+" y el precio es "+this.precio;
    }
    
   
   
}
