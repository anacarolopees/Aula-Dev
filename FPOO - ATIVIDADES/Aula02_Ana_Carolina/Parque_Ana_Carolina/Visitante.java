package Atividades_Ana_Carolina;

import java.util.Scanner;

public class Visitante {
	Scanner entrada = new Scanner (System.in);

	//atributos
	private String nome;
	private int idade;
	private double altura;
	
	//construtor com parametros
		Visitante(String nom, int ida, double al){
			this.nome = nom;
			this.idade = ida;
			this.altura = al;
		}
		
		//construtor padrao
		Visitante (){
			
		}
	
	//getter and setter
	String getnome () {
		return nome;
		}
     void setnome (String n) {
		System.out.println("Qual o seu nome:");
		n= entrada.next();
		nome = n;
		}
	int getidade () {
		return (int)idade;
		}
	 void setidade (int i) {
		System.out.println("Qual a sua idade:");
		i = entrada.nextInt();
		idade = i;
		}
	double getaltura () {
		return (double)altura;
		}
	void setaltura () {
		System.out.println("Qual a sua altura:");
		double al = entrada.nextDouble();
		altura = al;
		}
	//metodo especial
	public void podeAndarNoBrinquedo() {
	if (idade< 10 && altura < 1.50 ) {
		System.out.println("Nao pode andar no brinquedo!");
	}else  {
		System.out.println("Pode andar no brinquedo!");

	

	
	
	}
	
}

}