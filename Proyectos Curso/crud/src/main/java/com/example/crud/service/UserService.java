package com.example.crud.service;

import com.example.crud.model.User;
import com.example.crud.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    } // Esto harám que cuando creemos un repositorio meciante un new UserService() no
    // tendremos que darle nada porque el repo que le tenemos que pasar ya es el repo privado

    public List<User> list() { return repo.findAll(); }
    public User get(Long id) { return repo.findById(id).orElse(null); }
    public User save(User user) { return repo.save(user); }
    public void delete(Long id) { repo.deleteById(id); }
}
