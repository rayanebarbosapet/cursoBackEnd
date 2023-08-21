package com.project1.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooAplicattion {

	public static void main(String[] args) {
		SpringApplication.run(PooAplicattion.class, args);

		Aluno aluno = new Aluno();

		System.out.println("Parabèns aluno: "+aluno.getNome()+" seu ano de nascimento é: "+aluno.getAnoNasc()+ " e sua matrícula é: "+aluno.getMatricula()+" .\n ");
	}

}
