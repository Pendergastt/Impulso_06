package com.example.Libreria.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/Libreria";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
