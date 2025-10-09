package com.example.hospital.controller;

import com.example.hospital.Medico;
import com.example.hospital.MedicoDAO;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hospital")
public class MedicoController {

    @GetMapping("/medico/{id_medico}")
    public Medico leeMedico(@PathVariable int id_medico) throws Exception {
        MedicoDAO dao = new MedicoDAO();
        return dao.leer(id_medico);
    }

    @GetMapping("/medico/todos")
    public List<Medico> listaMedicos() throws Exception {
        MedicoDAO dao = new MedicoDAO();
        List<Medico> lista = dao.listar();
        return lista;
    }

    @PostMapping("/medico")
    public Map<String, Object> registrarMedico(@RequestBody Medico medico) throws Exception {
        MedicoDAO dao = new MedicoDAO();
        dao.crear(medico);
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Registro exitoso");
        respuesta.put("nombre", medico.getNombre());
        respuesta.put("edad", medico.getId_medico());
        return respuesta;
    }

    @PutMapping("/medico")
    public Map<String, Object> actualizarMedico(@RequestBody Medico medico) throws Exception {
        MedicoDAO dao = new MedicoDAO();
        dao.actualizar(medico);
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Registro exitoso");
        respuesta.put("nombre", medico.getNombre());
        respuesta.put("edad", medico.getId_medico());
        return respuesta;
    }

    @DeleteMapping("/medico/{id_medico}")
    public String borrarMedico(@PathVariable int id_medico) throws Exception {
        MedicoDAO dao = new MedicoDAO();
        dao.eliminar(id_medico);
        return "Medico borrado exitosamente";
    }
}
