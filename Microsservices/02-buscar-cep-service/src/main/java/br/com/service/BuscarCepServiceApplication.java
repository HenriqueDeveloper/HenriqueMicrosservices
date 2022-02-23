package br.com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class BuscarCepServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuscarCepServiceApplication.class, args);
	}

}
