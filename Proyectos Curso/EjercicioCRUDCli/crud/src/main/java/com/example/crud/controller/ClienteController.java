package com.example.crud.controller;


import com.example.crud.model.Cliente;
import com.example.crud.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController (ClienteService clienteService){
        this.clienteService=clienteService;
    }

    @GetMapping("/lista")
    public List<Cliente> listaClientes(){
        return clienteService.listaClientes();
    }

    @GetMapping("/buscar/{id}")
    public Cliente buscarCliente(@PathVariable Long id){

        return clienteService.buscarCliente(id);
    }

    //POST

    @PostMapping("/alta")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return clienteService.createCliente(cliente);
    }

    //PATCH
    @PatchMapping("/modificacion")
    public Cliente updateCliente(@RequestBody Cliente cliente){
        return clienteService.modificarCliente(cliente);
    }


    //DELETE

    @DeleteMapping("/borrar/{id}")
    public String eliminarCliente(@PathVariable Long id){
        clienteService.eliminarCliente(id);
        return "Cliente "+id+" eliminado correctamente";
    }

}
