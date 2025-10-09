package com.example.hospital;

import java.sql.*;
import java.util.*;

public class MedicoDAO {

    public void crear(Medico medico) throws Exception {
        String sql = "INSERT INTO medicos (nombre,apellido1,apellido2,dni,turno,especialidad) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, medico.getNombre());
            stmt.setString(2, medico.getApellido1());
            stmt.setString(3, medico.getApellido2());
            stmt.setString(4, medico.getDni());
            stmt.setString(5, medico.getTurno());
            stmt.setString(6, medico.getEspecialidad());
            stmt.executeUpdate();
        }
    }

    public Medico leer(int id_medico) throws Exception {
        String sql = "SELECT * FROM medicos WHERE id_medico = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_medico);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Medico m = new Medico();
                m.setId_medico(rs.getInt("id_medico"));
                m.setNombre(rs.getString("nombre"));
                m.setApellido1(rs.getString("apellido1"));
                m.setApellido2(rs.getString("apellido2"));
                m.setDni(rs.getString("dni"));
                m.setTurno(rs.getString("turno"));
                m.setEspecialidad(rs.getString("especialidad"));
                return m;
            }
        }
        return null;
    }

    public List<Medico> listar() throws Exception {
        String sql = "SELECT * FROM medicos";
        List<Medico> lista = new ArrayList<>();
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Medico m = new Medico();
                m.setId_medico(rs.getInt("id_medico"));
                m.setNombre(rs.getString("nombre"));
                m.setApellido1(rs.getString("apellido1"));
                m.setApellido2(rs.getString("apellido2"));
                m.setDni(rs.getString("dni"));
                m.setTurno(rs.getString("turno"));
                m.setEspecialidad(rs.getString("especialidad"));
                lista.add(m);
            }
        }
        return lista;
    }

    public void actualizar(Medico medico) throws Exception {
        String sql = "UPDATE medicos SET nombre = ?, apellido1 = ?, apellido2 = ?, dni = ?, turno = ?, especialidad = ? WHERE id_medico = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, medico.getNombre());
            stmt.setString(2, medico.getApellido1());
            stmt.setString(3, medico.getApellido2());
            stmt.setString(4, medico.getDni());
            stmt.setString(5, medico.getTurno());
            stmt.setString(6, medico.getEspecialidad());
            stmt.setInt(7, medico.getId_medico());
            stmt.executeUpdate();
        }
    }

    public void actualizarNombre(Medico medico) throws Exception {
        String sql = "UPDATE medicos SET  nombre = ? WHERE id_medico = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1,medico.getNombre());
            stmt.setInt(2, medico.getId_medico());
            stmt.executeUpdate();
        }
    }

    public void eliminar(int id_medico) throws Exception {
        String sql = "DELETE FROM medicos WHERE id_medico = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_medico);
            stmt.executeUpdate();
        }
    }
}
