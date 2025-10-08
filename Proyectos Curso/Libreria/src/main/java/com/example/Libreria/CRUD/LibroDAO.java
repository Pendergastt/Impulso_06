package com.example.Libreria.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {

    // CREATE
    public void crearLibro(Libro libro) throws Exception {

        String sql = "INSERT INTO Libros(titulo, autor, isbn, paginas, precio) VALUES (?,?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setString(3, libro.getIsbn());
            stmt.setInt(4, libro.getPaginas());
            stmt.setDouble(5, libro.getPrecio());
            stmt.executeUpdate();
        }
        System.out.println("libro añadido");
    }

    // READ

    public List<Libro> verLibros() throws Exception {
        String sql = "SELECT * FROM Libros";
        List<Libro> listaLibros = new ArrayList();
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Libro l = new Libro();
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setIsbn(rs.getString("isbn"));
                l.setPaginas(rs.getInt("paginas"));
                l.setPrecio(rs.getDouble("precio"));
                listaLibros.add(l);

            }
        }
        return listaLibros;
    }


    // UPDATE

    public void updateLibro(int id, Libro libro) throws Exception {
        String sql = "UPDATE Libros SET titulo=?, autor=?, isbn=?, paginas=?,precio=? WHERE id=?";
        try(Connection conn = Conexion.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,libro.getTitulo());
            stmt.setString(2,libro.getAutor());
            stmt.setString(3,libro.getIsbn());
            stmt.setInt(4,libro.getPaginas());
            stmt.setDouble(5,libro.getPrecio());
            stmt.setInt(6,id);
            stmt.executeUpdate();
        }

    }



    // DELETE

    public void deleteLibro(int id) throws Exception{
        String sql = "DELETE FROM Libros WHERE id=?";
        try(Connection conn= Conexion.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1,id);
            stmt.executeUpdate();
        }
    }




}
