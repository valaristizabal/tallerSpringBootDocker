package com.example.sping_boot_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Imports para poder construir el aplicativo web
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpingBootDockerApplication {

	//en el main de la web se verá el mensaje que retornamos
	@RequestMapping("/")
	public String home() {
		return "Hola mundo desde spring boot con docker";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpingBootDockerApplication.class, args);
	}

}
