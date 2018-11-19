package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ma.ensa.entities.User;
import ma.ensa.repository.*;

@SpringBootApplication
@ComponentScan({"ma.ensa.controllers"})
@EntityScan("ma.ensa.*")
@EnableJpaRepositories("ma.ensa.repository")
public class ApiWeb1Application implements CommandLineRunner {

	@Autowired
	private UserRepository userrepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiWeb1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userrepository.save(new User("emailk", "password", "fname", "lname"));
		userrepository.save(new User("emailn", "password", "fname", "lname"));
		userrepository.save(new User("emaib", "password", "fname", "lname"));
		
	}
}
