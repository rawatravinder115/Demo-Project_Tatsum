package com.example.Priority.Controller;

import com.example.Priority.Entity.User;
import com.example.Priority.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class controller {

    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public List<User> getALlUser(){
        return  repository.findAll();
    }

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user){
        return repository.save(user);
    }

    @GetMapping("/user/{name}")
    public User userByName(@PathVariable("name") String name){
        return repository.findByName(name);
    }
}
