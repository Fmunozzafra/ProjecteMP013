package com.iesebre.quefers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quefers")
@SpringBootApplication
public class QuefersApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuefersApplication.class, args);
	}

	@GetMapping
	public String hola() {
		return "Hola";
	}
}
