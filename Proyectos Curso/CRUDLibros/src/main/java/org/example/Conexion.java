package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static final String URL="jdbc:mysql://localhost:3306/CRUD_libros";
    private static final String USER="root";
    private static final String PASS="Root";
    // Esto vale para determinar variables de url, usuario y password para darle al metodo conexion

    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(URL,USER,PASS);
    }

}
