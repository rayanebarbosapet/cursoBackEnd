package com.project1.projeto;
import java.util.Scanner;

public class Aluno {
    Scanner sc = new Scanner(System.in);
   // Random ra = new Random();
    
   private String nome;
   private String anoNasc;
   private double matricula;
   
   public double getMatricula() {
    return matricula;
}

public void setMatricula(double matricula) {
    this.matricula = java.lang.Math.random();

  //matricula=math.random();
}

public String getAnoNasc() {

    return anoNasc;
}

public void setAnoNasc(String anoNasc) {
    this.anoNasc = anoNasc;
}

 public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}


    public  Aluno(){
System.out.println("Olá aluno, digite seu nome para efetuar a matrícula:\n");
this.setNome(sc.nextLine());

System.out.println(nome+"digite seu ano de nascimento:\n");
this.setAnoNasc(sc.nextLine());

System.out.println(nome+ "sua matricula é:\n"+ this.matricula);

    }
}
