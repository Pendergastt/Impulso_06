package com.example.ejemplos.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saludo")

public class SaludoController {

    @GetMapping("/personalizado") //Esto es ./saludo/personalizado
    public String saludoPersonalizado(@RequestParam String nombre, @RequestParam String ciudad){
        return "Hola "+nombre+" desde "+ciudad+"!";
    }

    @GetMapping("/simple/{nombre}")
    public String saludoSimple(@PathVariable String nombre){
        return "hola "+nombre+"!";
    }




}
