package com.bibliotecaAtv.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.bibliotecaAtv.biblioteca.repositories")
@EntityScan(basePackages = {"com.bibliotecaAtv.biblioteca.domains", "com.bibliotecaAtv.biblioteca.domains.enums"})
@ComponentScan(basePackages = "com.bibliotecaAtv.biblioteca")

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

}
