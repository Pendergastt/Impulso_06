package com.example.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CamaDAO {

    public void crear(Cama cama) throws Exception {
        String sql = "INSERT INTO Camas (zona, planta, fechaCambioSabanas) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cama.getZona());
            stmt.setString(2, cama.getPlanta());
            stmt.setDate(3, cama.getfechaCambioSabanas());
            stmt.executeUpdate();
        }
    }

    public Cama leer(int id) throws Exception {
        String sql = "SELECT * FROM camas WHERE id_cama = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Cama c = new Cama();
                c.setId_cama(rs.getInt("id_cama"));
                c.setZona(rs.getString("zona"));
                c.setPlanta(rs.getString("planta"));
                c.setFechaCambioSabanas(rs.getDate("fechaCambioSabanas"));
                return c;
            }
        }
        return null;
    }

    public void actualizar(Cama cama) throws Exception {
        String sql = "UPDATE camas SET zona = ?, planta = ?, fechaCambioSabanas = ? WHERE id_cama = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cama.getZona());
            stmt.setString(2, cama.getPlanta());
            stmt.setDate(3, cama.getfechaCambioSabanas());
            stmt.setInt(4, cama.getId_cama());
            stmt.executeUpdate();
        }
    }

    public void eliminar(int id_cama) throws Exception {
        String sql = "DELETE FROM camas WHERE id_cama = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_cama);
            stmt.executeUpdate();
        }
    }
}
