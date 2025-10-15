package com.example.crud.service;

import com.example.crud.model.Cliente;
import com.example.crud.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

public class ClienteService {
    private ClienteRepository repo;

    public ClienteService (ClienteRepository repo){
        this.repo = repo;
    }

    //CREATE
    public Cliente createCliente(Cliente cliente){
        return repo.save(cliente);
    }

    //READ

    public Cliente buscarCliente(Long id){
        return repo.findById(id).orElse(null);
    }

    public List<Cliente> listaClientes(){
        return repo.findAll();
    }

    //UPDATE

    public Cliente modificarCliente(Cliente cliente){
      return repo.save(cliente);
    }

    //DELETE

    public void eliminarCliente (Long id){
        repo.deleteById(id);
    }


}
