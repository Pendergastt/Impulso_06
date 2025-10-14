package com.example.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);


        UsuarioDAO dao = new UsuarioDAO();

        // Crear
        dao.crearUsuario(new Usuario(null, "Ana", 30));

        // Leer
        dao.obtenerUsuarios().forEach(u ->
                System.out.println(u.getId() + " - " + u.getNombre() + " - " + u.getEdad())
        );


    }
}

