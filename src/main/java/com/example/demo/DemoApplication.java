package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
	
	@GetMapping("/message")
	public String displayMessage() {
		return "Hi Message from Ganesh Sudhakar !";
	}
	
	@PostMapping("/{name}")
	public String findByName(@RequestBody String name) {
		return "#### Sudhakar ganesh printed name by parameter : "+ name;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
