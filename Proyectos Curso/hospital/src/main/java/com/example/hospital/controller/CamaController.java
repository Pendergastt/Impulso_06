package com.example.hospital.controller;


import com.example.hospital.Cama;
import com.example.hospital.CamaDAO;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;

@RestController
@RequestMapping("/hospital/camas")

public class CamaController {

    @GetMapping("/verCama")
    public String camaHospital(@RequestParam int id)throws Exception {
// Leer camas
        CamaDAO dao = new CamaDAO();
        Cama cama = dao.leer(id);
        if (cama != null) {
            System.out.println("Cliente leído: " );
        }

        return "Zona: " +cama.getZona() +  "<br>"  + "  Planta: " + cama.getPlanta()+  "<br>"   + "  Fecha ingreso: "   + cama.getfechaCambioSabanas() ;
    }


    //Crear camas
    @PostMapping("/crearCama")
    public Map<String, Object> registrarCama(@RequestBody Cama cama)throws Exception {
        Map<String, Object> respuesta = new HashMap<>();
        CamaDAO dao = new CamaDAO();
        dao.crear(cama);
        respuesta.put("mensaje", "Registro exitoso");
        respuesta.put("zona", cama.getZona());
        respuesta.put("planta", cama.getPlanta());
        respuesta.put("fechaCambioSabanas", cama.getfechaCambioSabanas());
        return respuesta;
    }

    @PutMapping
    public String putEndpoint() {
        return "Soy un endpoint PUT";
    }

    @PatchMapping("/actualizar")
    public String patchEndpoint(@RequestBody Cama cama )throws Exception {

        CamaDAO dao = new CamaDAO();
        dao.actualizar(cama);
        return "Soy un endpoint PATCH";
    }

    @DeleteMapping("/eliminado")
    public String deleteEndpoint(@RequestParam("id")  int id)throws Exception {

        CamaDAO dao = new CamaDAO();
        dao.eliminar(id);

        return "Soy un endpoint DELETE";
    }
}
