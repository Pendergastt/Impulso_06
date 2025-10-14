package com.example.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacienteDAO {

    // crear dao create, read update delete

    // HOLA FARY! :)

    //CREATE
    public void crear(Paciente paciente) throws Exception {
        String sql = "INSERT INTO pacientes (dni, nombre, apellido1, fechaIngreso) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, paciente.getDni());
            stmt.setString(2, paciente.getNombre());
            stmt.setString(3, paciente.getApellidos());
            stmt.setDate(4, paciente.getfechaIngreso());
            stmt.executeUpdate();
        }
    }

    public Map<String,Object> cerarCita(Cita cita) throws Exception {


        String selectPaciente = "SELECT * FROM pacientes WHERE dni=?";
        String selectMedico = "Select * FROM medicos WHERE especialidad=? and turno=?";
        String insertCita= "INSERT INTO pacientes_medicos(fk_id_paciente,fk_id_medico) VALUES(?,?)";
        Paciente p = new Paciente();
        Medico m = new Medico();

        try (Connection conn = Conexion.getConnection();

             PreparedStatement idp = conn.prepareStatement(selectPaciente)) {
            idp.setString(1,cita.getDni());
            ResultSet rsp = idp.executeQuery();
            System.out.println("el dni es "+cita.getDni());
            {
                if (rsp.next()) {

                    p.setId(rsp.getInt("id_paciente"));
                    p.setNombre(rsp.getString("nombre"));
                    p.setApellidos(rsp.getString("apellido1"));
                    p.setDni(rsp.getString("dni"));
                    p.setfechaIngreso(rsp.getDate("fechaIngreso"));

                }

            }
            try (
            PreparedStatement idm = conn.prepareStatement(selectMedico)) {
                idm.setString(1, cita.getEspecialidad());
                idm.setString(2,cita.getTurno());
                ResultSet rsm = idm.executeQuery();
                System.out.println("la especialidad es "+cita.getEspecialidad()+" y el turno "+cita.getTurno());
                {
                    if (rsm.next()) {

                        m.setId_medico(rsm.getInt("id_medico"));
                        m.setDni(rsm.getString("dni"));
                        m.setNombre(rsm.getString("nombre"));
                        m.setApellido1(rsm.getString("apellido1"));
                        m.setApellido2(rsm.getString("apellido2"));
                        m.setTurno(rsm.getString("turno"));
                        m.setEspecialidad((rsm.getString("especialidad")));

                    }

                }
                try(
                        PreparedStatement insert = conn.prepareStatement(insertCita)) {
                    insert.setInt(1, p.getId());
                    insert.setInt(2,m.getId_medico());
                    insert.executeUpdate();
                    System.out.println("actualizamos la tabla con paciente "+p.getId()+" y medico "+m.getId_medico());


                }
            }

        }
        Map<String,Object> confirmar = new HashMap<>();
        confirmar.put("nombrePaciente",p.getNombre());
        confirmar.put("nombreMedico",m.getNombre());
        confirmar.put("especialidad",m.getEspecialidad());
        confirmar.put("turno",m.getTurno());
        return confirmar;
    }

    //READ
    public static Paciente leer(int id) throws Exception {
        String sql = "SELECT * FROM pacientes WHERE id_paciente = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Paciente p = new Paciente();
                p.setId(rs.getInt("id_paciente"));
                p.setDni(rs.getString("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidos(rs.getString("apellido1"));
                p.setfechaIngreso(rs.getDate("fechaIngreso"));
                return p;
            }
        }
        return null;

    }

    public Paciente buscarDni(String dni) throws Exception {
        String sql = "SELECT * FROM pacientes WHERE dni = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, dni);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Paciente p = new Paciente();
                p.setId(rs.getInt("id_paciente"));
                p.setDni(rs.getString("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidos(rs.getString("apellido1"));
                p.setfechaIngreso(rs.getDate("fechaIngreso"));
                return p;
            }
        }
        return null;

    }

    public List<Paciente> listar() throws Exception {
        String sql = "SELECT * FROM pacientes";
        List<Paciente> lista = new ArrayList<>();
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Paciente p = new Paciente();
                p.setId(rs.getInt("id_paciente"));
                p.setDni(rs.getString("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidos(rs.getString("apellido1"));
                p.setfechaIngreso(rs.getDate("fechaIngreso"));
                lista.add(p);
            }
        }
        return lista;
    }

    public List<Paciente> listarPorMedico(int id) throws Exception {
        String sql = "SELECT p.*\n" +
                "FROM pacientes p\n" +
                "JOIN pacientes_medicos pm ON p.id_paciente = pm.fk_id_paciente\n" +
                "WHERE pm.fk_id_medico = ?;";
        List<Paciente> lista = new ArrayList<>();
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            {
                while (rs.next()) {
                    Paciente p = new Paciente();
                    p.setId(rs.getInt("id_paciente"));
                    p.setDni(rs.getString("dni"));
                    p.setNombre(rs.getString("nombre"));
                    p.setApellidos(rs.getString("apellido1"));
                    p.setfechaIngreso(rs.getDate("fechaIngreso"));
                    lista.add(p);
                }

            }
        }
        return lista;
    }
        //UPDATE
        public static void actualizar(int id,Paciente p) throws Exception {
            String sql = "UPDATE pacientes SET dni = ?, nombre = ?, apellido1 = ?, fechaIngreso = ?, WHERE id_paciente = ?";

            try (Connection conn = Conexion.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, p.getDni());
                stmt.setString(2, p.getNombre());
                stmt.setString(3, p.getApellidos());
                stmt.setDate(4, p.getfechaIngreso());
                stmt.setInt(5, id);
                stmt.executeUpdate();
            }
        }

        //DELETE
        public static void eliminar(int id) throws Exception {
            String sql = "DELETE FROM paciente WHERE id = ?";
            try (Connection conn = Conexion.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            }
        }

}
