package com.example.hospital.controller;


import com.example.hospital.Usuario;
import com.example.hospital.UsuarioDAO;
import org.bson.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/usuario")

public class UsuarioController {


    @GetMapping("/buscar/{id}")
    public Document obtenerDocumentoPorId(@PathVariable String id) {
        UsuarioDAO dao = new UsuarioDAO();


        Document usuario = dao.buscarUsuario(id).getBody();

         return usuario;

    }

    @PostMapping("/agregar")
    public void agregarUsuario(@RequestBody Usuario usuario){
        UsuarioDAO dao = new UsuarioDAO();

        dao.crearUsuario(usuario);

    }

    @PatchMapping("/modificar/{id}")
    public void modUsuario(@PathVariable String id, @RequestBody Usuario modificacion){
        UsuarioDAO dao = new UsuarioDAO();

        dao.actualizarUsuario(id, modificacion.getNombre(), modificacion.getEdad());
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable String id){
        UsuarioDAO dao = new UsuarioDAO();
        dao.eliminarUsuario(id);

    }




}


