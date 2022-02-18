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
		return "Mentalidades e Habilidades utilizadas: Persistência, orientação ao detalhe";
	}

	@GetMapping ("/rota2")
	public String atividade2(){
		return "Aprender ao máximo sobre Spring Boot e como funciona cada função, parâmetro, etc.";
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
