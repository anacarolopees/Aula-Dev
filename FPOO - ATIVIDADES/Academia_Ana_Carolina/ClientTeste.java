package Atividades_Ana_Carolina;

import java.util.Scanner;

public class ClientTeste {
	public static void main(String[] args) {

	Scanner entrada = new Scanner (System.in);
		Client cl1 = new Client();
		System.out.println("Qual o seu cpf:");
		cl1.cpf = entrada.nextDouble();
		System.out.println("Qual o seu nome:");
		cl1.nome = entrada.next();
		System.out.println("Qual o seu telefone:");
		cl1.telefone = entrada.nextDouble();
		System.out.println("Qual o sua idade:");
		cl1.idade = entrada.nextInt();
		System.out.println("Qual o sua altura:");
		cl1.altura = entrada.nextDouble();
		System.out.println("Qual o seu peso:");
		cl1.peso = entrada.nextDouble();
		System.out.println("Qual o seu peso-Alvo:");
		cl1.pesometa = entrada.nextDouble();
		cl1.imc();
		cl1.pesometa();
		cl1.imprimir();

	}
	
}
