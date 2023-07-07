package com.example.demo;

import com.example.demo.entities.Authority;
import com.example.demo.entities.AuthorityName;
import com.example.demo.entities.User;
import com.example.demo.repositories.AuthorityRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootApplication
public class BackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingApplication(
			UserRepository userRepository,
			AuthorityRepository authorityRepository
	) {
		return args -> {
			/*
			authorityRepository.save(new Authority(AuthorityName.ROLE_ADMIN));
			authorityRepository.save(new Authority(AuthorityName.ROLE_USER));

			userRepository.save(
					new User("admin",new BCryptPasswordEncoder().encode("pass"),
							List.of(
									authorityRepository.findByName(AuthorityName.ROLE_ADMIN)
							)
					)
			);
			 */
		};
	};
}
