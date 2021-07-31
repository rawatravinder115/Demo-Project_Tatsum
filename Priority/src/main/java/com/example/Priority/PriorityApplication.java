package com.example.Priority;

import com.example.Priority.Entity.User;
import com.example.Priority.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriorityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PriorityApplication.class, args);
	}

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new User("ravi",1,2,3,4));
		repository.save(new User("yash",2,4,45,5));
		repository.save(new User("rishu",3,5,7,7));
	}
}
