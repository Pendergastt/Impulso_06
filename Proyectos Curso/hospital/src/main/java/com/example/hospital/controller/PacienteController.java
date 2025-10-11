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

    @PostMapping("/insertar")
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

}


//HACER UN GET QUE MUESTRE TODOS LOS PACIENTES

    //HACER UN POST PARA ANADIR UN PACIENTE

    //HACER UN PATCH PARA MODIFICAR DATOS DE PACIENTE

    //HACER UN DELETE DE PACIENTE POR DNI





