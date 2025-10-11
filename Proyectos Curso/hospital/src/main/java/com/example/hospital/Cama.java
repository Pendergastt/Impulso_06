package com.example.hospital;

import java.sql.Date;

public class Cama {

    private int id_cama;
    private String zona;
    private String planta;
    private Date fechaCambioSabanas;

    public Cama() {}

    public Cama(String zona, String planta, Date  fechaCambioSabanas) {
        this.zona = zona;
        this.planta = planta;
        this.fechaCambioSabanas = fechaCambioSabanas;
    }

    public int getId_cama() {
        return id_cama;
    }

    public void setId_cama(int id_cama) {
        this.id_cama = id_cama;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public Date getfechaCambioSabanas() {
        return fechaCambioSabanas;
    }

    public void setFechaCambioSabanas(Date fechaCambioSabanas) {
        this.fechaCambioSabanas = fechaCambioSabanas;
    }
}
