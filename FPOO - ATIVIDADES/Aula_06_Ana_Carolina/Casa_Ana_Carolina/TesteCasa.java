package Atividades_Ana_Carolina;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// inst
		Casa c1 = new Casa();
		Quarto q1 = new Quarto();
		Sala sala1 = new Sala();
		//1 casa
		System.out.println("------ESCREVA AS INFORMACOES DA PRIMEIRA CASA-------");
		System.out.println("Digite as infos de sua casa: ");
		System.out.println("Cor: " );
		c1.setCor(entrada.nextLine());
		System.out.println("Preco: ");
		c1.setPreco(entrada.nextFloat());
		System.out.println("Metragem: ");
		c1.setMetragem(entrada.nextFloat());
		System.out.println("------QUARTO-------");
		System.out.println("Nome do comodo: ");
		q1.setNome(entrada.next());
		System.out.println("Número de camas: " ); 
		q1.setNumeroCamas(entrada.nextInt()); 
		System.out.println("------SALA-------");
		System.out.println("Nome do comodo: ");
		sala1.setNome(entrada.next());
		System.out.println("Tem TV: " ); 
		System.out.println("1----------Sim");
		System.out.println("2----------Nao");
		int i = entrada.nextInt();
		sala1.TemTv(i);
		//casa2
		Casa c2 = new Casa();
		Quarto q2 = new Quarto();
		Sala sala2 = new Sala();
		System.out.println("------ESCREVA AS INFORMACOES DA SEGUNDA CASA-------");
		System.out.println("Cor: " );
		c2.setCor(entrada.next());
		System.out.println("Preco: ");
		c2.setPreco(entrada.nextFloat());
		System.out.println("Metragem: ");
		c2.setMetragem(entrada.nextFloat());
		System.out.println("------QUARTO-------");
		System.out.println("Nome do comodo: ");
		q2.setNome(entrada.next());
		System.out.println("Número de camas: " ); 
		q2.setNumeroCamas(entrada.nextInt()); 
		System.out.println("------SALA-------");
		System.out.println("Nome do comodo: ");
		sala2.setNome(entrada.next());
		System.out.println("Tem TV: " ); 
		System.out.println("1----------Sim");
		System.out.println("2----------Nao"); 
		int ii = entrada.nextInt();
		sala1.TemTv(ii);
		
		//met esp
		System.out.println("O nome do comodo e: " + q1.getNome());
		System.out.println("O nome da sala e: " + sala1.getNome());
		c1.mostrarDetalhes();
		
		System.out.println("O nome do comodo e: " + q2.getNome());
		System.out.println("O nome da sala e: " + sala2.getNome());
		c2.mostrarDetalhes();
			
		
		
	}

}
