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

    @GetMapping
    public List<Cliente> listaClientes(){
        return clienteService.listaClientes();
    }

    @GetMapping
    public Cliente buscarCliente(Long id){
        return clienteService.buscarCliente(id);
    }

    //POST

    @PostMapping
    public Cliente crearCliente(Cliente cliente){
        return clienteService.createCliente(cliente);
    }

    //PATCH
    @PatchMapping
    public Cliente updateCliente(Cliente cliente){
        return clienteService.modificarCliente(cliente);
    }


    //DELETE

    @DeleteMapping
    public String eliminarCliente(Long id){
        clienteService.eliminarCliente(id);
        return "Cliente "+id+" eliminado correctamente";
    }

}
