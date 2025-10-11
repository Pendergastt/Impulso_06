package com.example.hospital;

public class Cita {
    private String dni;
    private String especialidad;
    private String turno;

    public Cita(String dni, String especialidad, String turno){
        this.dni=dni;
        this.especialidad=especialidad;
        this.turno=turno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
