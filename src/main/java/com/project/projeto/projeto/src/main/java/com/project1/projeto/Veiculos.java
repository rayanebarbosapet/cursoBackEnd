package com.project1.projeto;

public class Veiculos {
   public String modelo;
   public String proprietario;
   public String cor;
   public String renavam;
   public String marca;
   public double km;
   public int ano;
   public float valor;
   public double valorIPVA;

    public double calcularIPVA(float valor){
        valorIPVA = valor * 0.04;
        return valorIPVA;
        
    }
    void acelerar(){
        //make vrum
    }

    public void imprimeDocumento(){

      System.out.println(
        this.modelo+"\n"+
        this.marca+"\n"+
        this.cor+"\n"+
        this.cor+"\n"+
        this.proprietario+"\n"+
        this.renavam+"\n"+
        this.ano+"\n"+
        this.km
      );
    }
    
}
