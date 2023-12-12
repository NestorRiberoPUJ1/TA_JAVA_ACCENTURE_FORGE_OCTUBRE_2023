package com.ayudantias.cadenas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CadenasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadenasApplication.class, args);
	}

	@GetMapping("/")
	public String root() {
		return "Hola Cliente Bienvenido a Java";
	}

	@GetMapping("/random")
	public String random() {
		return "Java es estricto pero muy rápido";
	}
	

}
