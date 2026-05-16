package com.example.mongodb.mongoreplicasetdemo.repository;

import com.example.mongodb.mongoreplicasetdemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByName(String name);
}
