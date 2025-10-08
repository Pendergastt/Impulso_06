package org.example;



// Aquí es donde creamos todas las funciones del Libro


import java.sql.*;
import java.util.*;

public class LibroDAO {
    //CREACION DE LIBROS
    public void crearLibro(Libro libro) throws Exception {
        String sql = "INSERT INTO libros VALUES (?,?,?,?,?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setString(3, libro.getIsbn());
            stmt.setInt(4, libro.getPaginas());
            stmt.setDouble(5, libro.getPrecio());
            stmt.executeUpdate(); // para actualizar la sql
        }

    }

    //BUSQUEDA DE LIBROS
    public Libro buscarTitulo(String titulo) throws Exception {
        String sql = "SELECT FROM Libros WHERE titulo=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Libro l = new Libro();
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setIsbn(rs.getString("isbn"));
                l.setPaginas(rs.getInt("paginas"));
                l.setPrecio(rs.getDouble("precio"));
                return l;
            }
        }
        return null;
    }

    public Libro buscarAutor(String autor) throws Exception {
        String sql = "SELECT FROM Libros WHERE autor=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, autor);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Libro l = new Libro();
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setIsbn(rs.getString("isbn"));
                l.setPaginas(rs.getInt("paginas"));
                l.setPrecio(rs.getDouble("precio"));
                return l;
            }
        }
        return null;
    }

    public Libro buscarIsbn(String isbn) throws Exception {
        String sql = "SELECT FROM Libros WHERE isbn=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, isbn);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Libro l = new Libro();
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setIsbn(rs.getString("isbn"));
                l.setPaginas(rs.getInt("paginas"));
                l.setPrecio(rs.getDouble("precio"));
                return l;
            }
        }
        return null;
    }

    public Libro buscarPaginas(int paginas) throws Exception {
        String sql = "SELECT FROM Libros WHERE autor=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, paginas);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Libro l = new Libro();
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setIsbn(rs.getString("isbn"));
                l.setPaginas(rs.getInt("paginas"));
                l.setPrecio(rs.getDouble("precio"));
                return l;
            }
        }
        return null;
    }

    public Libro buscarPrecio(Double precio) throws Exception {
        String sql = "SELECT FROM Libros WHERE precio=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, precio);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Libro l = new Libro();
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setIsbn(rs.getString("isbn"));
                l.setPaginas(rs.getInt("paginas"));
                l.setPrecio(rs.getDouble("precio"));
                return l;
            }
        }
        return null;
    }

    public Libro mostrarLibros(int id) throws Exception{
        String sql = "SELECT * FROM Libros WHERE id=?";
        try( Connection conn = Conexion.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1,id);
            ResultSet rs= stmt.executeQuery();
            if (rs.next()){
                Libro l= new Libro();
                l.setId(rs.getInt("id"));
                l.setTitulo(rs.get);
            }
        }

        return l;
    }

    //UPDATE

    public void updateLibro(Libro libro) throws Exception{
        String sql= "UPDATE Libros SET titulo=?,autor=?, isbn=?,paginas=?,precio=? WHERE id=?";
        try (Connection conn=Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,libro.getTitulo());
            stmt.setString(2,libro.getAutor());
            stmt.setString(3,libro.getIsbn());
            stmt.setInt(4,libro.getPaginas());
            stmt.setDouble(5,libro.getPrecio());
            stmt.setInt(6,libro.getId());
            stmt.executeUpdate();
        }
    }

    //DELETE

    public void deleteLibro(Libro libro) throws Exception{
        String sql= "DELETE FROM Libros WHERE id=?";
        try (Connection conn=Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1,libro.getId());
            stmt.executeUpdate();
        }
    }
}