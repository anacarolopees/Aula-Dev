package Atividades_Ana_Carolina;

import java.util.Scanner;


public class Brinquedo {
	Scanner entrada = new Scanner (System.in);
	//atributos
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	
	
	//construtor com parametros
	Brinquedo(String nom, double alt, int capac){
		this.nome = nom;
		this.alturaMinima = alt;
		this.capacidadeMaxima = capac;
	}
	
	//construtor padrao
	Brinquedo (){
		
	}
	void setnome () {
		System.out.println("Nome:");
		String n= entrada.next();
		nome = n;
		}
	void setalturaMinima () {
		System.out.println("Altura minima:");
		double a= entrada.nextDouble();
		alturaMinima = a;
		}
	void setcapacidadeMaxima () {
		System.out.println("Capacidade maxima:");
		int k= entrada.nextInt();
		capacidadeMaxima = k;
		}
	
	
	//metodo especial
	public void exibirInfo() {
	System.out.println("Informações do brinquedo:");
	System.out.println("Nome:" + nome);
	System.out.println("Altura Mínima:" + alturaMinima);
	System.out.println("Capacidade Máxima:" + capacidadeMaxima);
	}

	
	


}
