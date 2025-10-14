package com.example.hospital.controller;


import com.example.hospital.UsuarioDAO;
import org.bson.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/usuario")

public class UsuarioController {

    @GetMapping("/buscar/{id}")
    public Document obtenerDocumentoPorId(@PathVariable String id) {
        UsuarioDAO dao = new UsuarioDAO();


        Document usuario = dao.buscarUsuario(id).getBody();

         return usuario;



    }
}



