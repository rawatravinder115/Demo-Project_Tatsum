package com.example.Priority;

import com.example.Priority.Entity.User;
import com.example.Priority.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PriorityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriorityApplication.class, args);
	}

	}
}
