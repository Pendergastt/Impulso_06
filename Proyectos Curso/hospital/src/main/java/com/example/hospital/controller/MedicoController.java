package com.example.hospital.controller;

import com.example.hospital.Medico;
import com.example.hospital.MedicoDAO;
import com.example.hospital.Paciente;
import com.example.hospital.PacienteDAO;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hospital/medico")
public class MedicoController {

    @GetMapping("/buscar/{id_medico}")
    public Medico buscaMedico(@PathVariable int id_medico) throws Exception {
        MedicoDAO dao = new MedicoDAO();
        return dao.leer(id_medico);
    }

    @GetMapping("/buscar-dni/{dni}")
    public Medico leeMedico(@PathVariable String dni) throws Exception {
        MedicoDAO dao = new MedicoDAO();
        return dao.buscarPorDni(dni);
    }


    @GetMapping("/buscar/todos")
    public List<Medico> listaMedicos() throws Exception {
        MedicoDAO dao = new MedicoDAO();
        List<Medico> lista = dao.listar();
        return lista;
    }

    @GetMapping("/listaPacientes")
    public List<Paciente> listaPacientes(@RequestParam int id) throws Exception{
        PacienteDAO dao = new PacienteDAO();
        List<Paciente> lista = dao.listarPorMedico(id);
        return lista;
    }

    @PostMapping("/crea-medico")
    public Map<String, Object> registrarMedico(@RequestBody Medico medico) throws Exception {
        MedicoDAO dao = new MedicoDAO();
        dao.crear(medico);
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Registro exitoso");
        respuesta.put("nombre", medico.getNombre());
        respuesta.put("id", medico.getId_medico());
        return respuesta;
    }
/*
    @PostMapping("/crearCita")
    public String crearCita(@RequestBody Object cita) throws Exception{
        MedicoDAO medDao=new MedicoDAO();
        PacienteDAO pacDao=new PacienteDAO();
        Object cita= {MedicoDao}
    }
*/
    @PutMapping("/actualiza-medico")
    public Map<String, Object> actualizarMedico(@RequestBody Medico medico) throws Exception {
        MedicoDAO dao = new MedicoDAO();
        dao.actualizar(medico);
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Registro exitoso");
        respuesta.put("nombre", medico.getNombre());
        respuesta.put("edad", medico.getId_medico());
        return respuesta;
    }

    @DeleteMapping("/borra-medico/{id_medico}")
    public String borrarMedico(@PathVariable int id_medico) throws Exception {
        MedicoDAO dao = new MedicoDAO();
        dao.eliminar(id_medico);
        return "Medico borrado exitosamente";
    }

    @DeleteMapping("/borra-medico-dni/{dni}")
    public String borrarMedico(@PathVariable String dni) throws Exception {
        MedicoDAO dao = new MedicoDAO();
        dao.borrarPorDni(dni);
        return "Medico borrado por dni exitosamente";
    }
}
