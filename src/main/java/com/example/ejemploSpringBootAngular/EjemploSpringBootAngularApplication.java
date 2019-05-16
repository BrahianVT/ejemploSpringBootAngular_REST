package com.example.ejemploSpringBootAngular;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ejemploSpringBootAngular.entities.User;
import com.example.ejemploSpringBootAngular.repositories.UserRepository;

@SpringBootApplication
public class EjemploSpringBootAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploSpringBootAngularApplication.class, args);
	}

	
	// CommandLineRunner to run specific methods when a application stars the code is executed before method run
	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("Jhon", "Julie", "Jennifer", "Helen" ,"Rachel")
					.forEach(name ->{
						User user = new User(name, name.toLowerCase() + "@gmail.com");
						userRepository.save(user);
					});
					userRepository.findAll().forEach(System.out::println);
		};
	}
}
