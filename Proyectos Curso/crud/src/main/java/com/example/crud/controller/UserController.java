package com.example.crud.controller;

import java.util.List;
import com.example.crud.model.User;
import com.example.crud.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")

public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> list() { return service.list(); }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) { return service.get(id); }

    @PostMapping
    public User save(@RequestBody User user) { return service.save(user); }

    @PatchMapping("/{id}")
    public User update(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
