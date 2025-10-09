package com.example.ejemplos.controller;

import com.example.ejemplos.models.Persona;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/registro")

    public class EndpointController {
    @PostMapping("/persona")
        public Map<String, Object> registrarPersona(@RequestBody Persona persona){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("mensaje","Registro exitoso");
        respuesta.put("nombre",persona.getNombre());
        respuesta.put("edad", persona.getEdad());
        respuesta.put("Prueba de objeto hash", persona);
        respuesta.put("Prueba de Mensaje hash", 8);
        return respuesta;
    }

    }
