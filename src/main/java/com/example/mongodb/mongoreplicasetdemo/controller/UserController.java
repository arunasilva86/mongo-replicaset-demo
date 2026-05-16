package com.example.mongodb.mongoreplicasetdemo.controller;

import com.example.mongodb.mongoreplicasetdemo.model.User;
import com.example.mongodb.mongoreplicasetdemo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping
    public List<User> getAll() {
        return service.getAllUsers();
    }

    @GetMapping("/{name}")
    public List<User> findByName(@PathVariable String name) {
        return service.findByName(name);
    }
}
