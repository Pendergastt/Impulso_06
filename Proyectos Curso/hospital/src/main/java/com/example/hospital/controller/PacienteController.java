package com.example.hospital.controller;

import com.example.hospital.Cita;
import com.example.hospital.Paciente;
import com.example.hospital.PacienteDAO;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hospital") //localhost:8080/hospital/lista

public class PacienteController {


    //HACER GET QUE BUSQUE PACIENTE POR DNI
    @GetMapping("/pacientes/lista")
        public List<Paciente> listaPacientes() throws Exception{
            PacienteDAO dao = new PacienteDAO();
            List<Paciente> lista;
            lista = dao.listar();
            return lista;

    }

    @PostMapping("paciente/insertar")
    public Map<String, Object> registrarPaciente(@RequestBody Paciente paciente)
            throws Exception {
        PacienteDAO dao = new PacienteDAO();
        dao.crear(paciente);
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Registro exitoso");
        respuesta.put("DNI", paciente.getDni());
        respuesta.put("nombre", paciente.getNombre());
        respuesta.put("Apellidos", paciente.getApellidos());
        respuesta.put("Fecha Ingreso", paciente.getfechaIngreso());
        return respuesta;
    }

    @PostMapping("/cita")
    public Map<String, Object> registrarCita(@RequestBody Cita cita) throws Exception{

        PacienteDAO dao= new PacienteDAO();
        return dao.cerarCita(cita);

    }
    //HACER UN PATCH PARA MODIFICAR DATOS DE PACIENTE

    //@RestController
    @PatchMapping("/{id}")
    public static Paciente ActualizarPaciente(@PathVariable int id, @RequestBody Paciente PacienteDatos) throws Exception{


        PacienteDAO.actualizar(id, PacienteDatos);
        Paciente pacienteModificado = PacienteDAO.leer(id);


        /*
        Paciente paciente = PacienteDAO.leer(id);


        if (PacienteDatos.getDni() != null) {
            paciente.setDni(PacienteDatos.getDni());
        }
        if (PacienteDatos.getNombre() != null) {
            paciente.setNombre(PacienteDatos.getNombre());
        }
        if (PacienteDatos.getApellidos() != null) {
            paciente.setApellidos(PacienteDatos.getApellidos());
        }
        if (PacienteDatos.getfechaIngreso() != null) {
            paciente.setfechaIngreso(PacienteDatos.getfechaIngreso());
        }
        */
       return pacienteModificado;

    }
//HACER UN DELETE DE PACIENTE POR DNI

    @DeleteMapping("/{id}")
    public static void deletePaciente(@PathVariable int id) throws Exception{
        PacienteDAO.eliminar(id);
    }


}




