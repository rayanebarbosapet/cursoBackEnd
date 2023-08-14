package com.project1.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooAplicattion {

	public static void main(String[] args) {
		SpringApplication.run(PooAplicattion.class, args);

		Veiculos carroRayane= new Veiculos();
		carroRayane.proprietario = "Rayane";
		carroRayane.renanavam = "1245545";
		carroRayane.marca = "Ford";
		carroRayane.modelo ="Ford Ka";
		carroRayane.ano = 2019;
		carroRayane.cor = "preto";
		carroRayane.km = 4665.657;

		System.out.println(carroRayane.proprietario);
	}

}
