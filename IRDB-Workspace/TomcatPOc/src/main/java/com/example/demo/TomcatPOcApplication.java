package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TomcatPOcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TomcatPOcApplication.class, args);
	}

}


@RestController(value = "/")
class abc{
	
	@GetMapping(path = "/")
	public String getString() {
		return "Hello";
	}
}