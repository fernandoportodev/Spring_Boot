package com.aplicativo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppApplication {

	@GetMapping ("/rota1")
	public String atividade1(){
		return "Hello World";
	}

	@GetMapping ("/rota2")
	public String atividade2(){
		return "Hello World 2";
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
