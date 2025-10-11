package com.example.hospital;

import java.sql.Date;

public class Paciente {

    private int id;
    private String dni;
    private String nombre;
    private String apellidos;
    private Date fechaIngreso;

    public Paciente() {
    }

    public Paciente(String dni, String nombre, String apellidos, Date fechaIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;


    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getfechaIngreso() {
        return fechaIngreso;
    }

    public void setfechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}