package com.example.Priority.Controller;

import com.example.Priority.Entity.User;
import com.example.Priority.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class controller {

    @Autowired
    private UserRepository repository;

    @GetMapping("/user")
    public List<User> getALlUser(){
        return  repository.findAll();
    }
}
