package Atividades_Ana_Carolina;

import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//inst obj pao doce e bolo
		ProdutoPadaria p1 = new Pao();
		ProdutoPadaria p2 = new Pao();
		ProdutoPadaria b1 = new Doce();
		ProdutoPadaria b2 = new Doce();
		ProdutoPadaria d1 = new Doce();
		ProdutoPadaria d2 = new Bolo();
		Pessoaa pes = new Pessoaa();
		System.out.println("Coloque seu nome: ");
		pes.setNome(entrada.next());

		//pao 1
		System.out.println("------ESCREVA AS INFORMACOES DO PRIMEIRO PAO -------");
		System.out.println("Coloque o nome do primeiro pao");
		p1.setNome(entrada.next());
		System.out.println("Coloque o preco do primeiro pao");
		p1.setPreco(entrada.nextDouble());
		
		
		System.out.println("------ESCREVA AS INFORMACOES DO SEGUNDO PAO -------");
		System.out.println("Coloque o nome do segundo pao");
		p2.setNome(entrada.next());
		System.out.println("Coloque o preco do segundo pao");
		p2.setPreco(entrada.nextDouble());
		
		//bolo 1
		System.out.println("------ESCREVA AS INFORMACOES DO PRIMEIRO BOLO-------");
		System.out.println("Coloque o nome do primeiro bolo");
		b1.setNome(entrada.next());
		System.out.println("Coloque o preco do primeiro bolo");
		b1.setPreco(entrada.nextDouble());
		
		
		System.out.println("------ESCREVA AS INFORMACOES DO SEGUNDO BOLO-------");
		System.out.println("Coloque o nome do segundo bolo");
		b2.setNome(entrada.next());
		System.out.println("Coloque o preco do segundo bolo");
		b2.setPreco(entrada.nextDouble());
		
	
		//doce
		System.out.println("------ESCREVA AS INFORMACOES DO PRIMEIRO DOCE-------");
		System.out.println("Coloque o nome do primeiro doce");
		d1.setNome(entrada.next());
		System.out.println("Coloque o preco do primeiro doce");
		d1.setPreco(entrada.nextDouble());		
		
		System.out.println("------ESCREVA AS INFORMACOES DO SEGUNDO DOCE-------");
		System.out.println("Coloque o nome do segundo doce");
		d2.setNome(entrada.next());
		System.out.println("Coloque o preco do segundo doce");
		d2.setPreco(entrada.nextDouble());	
		
		//met esp
		pes.exibirNome();
		p1.exibir();
		p2.exibir();
		b1.exibir();
		b2.exibir();
		d1.exibir();
		d2.exibir();
		pes.comer();


		double total = p1.preco + p2.preco + b1.preco + b2.preco + d1.preco + d2.preco;
		System.out.println("-----------------------------------------------------------------");
		System.out.println("O TOTAL DA SUA COMPRA FOI NA NOSSA PADARIA FOI DE: " + total + " REAIS!");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("OBRIGADA, VOLTE SEMPRE!");
	}

}
