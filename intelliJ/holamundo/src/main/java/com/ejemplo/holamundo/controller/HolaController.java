package com.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/saludo")
    public String saludar() {
        return "¡Hola Mundo desde Spring Boot!";
    }

    @GetMapping("/despedir")
    public String despedir() {
        return "¡adios!";
    }

    @GetMapping("/sort")
    public String ordenar() {

        String[] palabras = {"silla", "mesa", "zapato", "camiseta", "almohada", "tomahawk", "repetidor","colador","camisetas","terrible","mola"};
        String aux;
        String p1;
        String p2;
        String cadena="";

        for (int i = 0; i < palabras.length; i++) {

            for (int j = 1; j < palabras.length - i; j++) {
                if (palabras[j].compareTo(palabras[j - 1]) <= 0) {
                    aux = palabras[j - 1];
                    palabras[j - 1] = palabras[j];
                    palabras[j] = aux;
                }
            };
        }

            return String.join("-", palabras);
    }
}