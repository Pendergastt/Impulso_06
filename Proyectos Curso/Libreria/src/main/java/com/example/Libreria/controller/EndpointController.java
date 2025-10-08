package com.example.Libreria.controller;


import com.example.Libreria.CRUD.Libro;
import com.example.Libreria.CRUD.LibroDAO;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping
@CrossOrigin

public class EndpointController {

    LibroDAO dao = new LibroDAO();

    @GetMapping("/Listado")
    public String mostrarLibros() throws Exception {
        List<Libro> listaLibros = dao.verLibros();
        String resultado = "";
        for (Libro l : listaLibros) {
            resultado += "\n " + l.toString();
        }
        return resultado;

    }

    @GetMapping("/Libro")
    public String mostrarUnLibro() throws Exception {
        Libro resultado = dao.mostrarLibro(1);
        return resultado.toString();
    }


    @PostMapping("/agregar")
    public String postEndpoint() throws Exception {
        Libro nLibro = new Libro("Pruebalibro", "autorlibro", "isbn12", 226, 12.90);

        dao.crearLibro(nLibro);
        return "Se ha insertado un libro";
    }

    @PatchMapping("/modificar")
    public String modificarLibro() throws Exception {
        Libro mLibro = new Libro("modificado", "autorMod", "isbnMOD", 12, 1555);
        dao.updateLibro(2, mLibro);
        return "Se ha modificado el libro";
    }

    @DeleteMapping("/borrar")
    public String borrarLibro() throws Exception {
        dao.deleteLibro(1);
        return "Se ha borrado el libro 1";
    }

}


