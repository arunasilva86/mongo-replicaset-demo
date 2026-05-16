package com.example.mongodb.mongoreplicasetdemo.service;

import com.example.mongodb.mongoreplicasetdemo.model.User;
import com.example.mongodb.mongoreplicasetdemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public List<User> findByName(String name) {
        return repository.findByName(name);
    }

}
