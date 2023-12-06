package Atividades_Ana_Carolina;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class TesteVoo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		LocalDate dataIda = null;
		LocalDate dataVolta = null;
		//inst cliente
		Cliente cliente1 = new Cliente();
		System.out.println("Insira os seus dados:");
		System.out.println("Nome: ");
		cliente1.setNome(entrada.next());
		System.out.println("Sobrenome: ");
		cliente1.setSobrenome(entrada.next());
		System.out.println("Email:");
		cliente1.setEmail(entrada.next());

		//inst voo
		int i = 1;
		System.out.println("Quantia de passagens desejadas: ");
		entrada.nextInt();
		
		while( i < 3) {
		Voo voo1 = new Voo("MT200080", 8000f);
		System.out.println("Insira os dados do seu " + i + " voo: ");
		System.out.println("Origem:");
		voo1.setOrigem(entrada.next());
		System.out.println("Destino:");
		voo1.setDestino(entrada.next());
		System.out.println("Data ida(dd-MM-yyyy):");
		String dataI = entrada.next();
		dataIda = LocalDate.parse (dataI, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Data volta(dd-MM-yyyy):");
		String dataV = entrada.next();
		dataVolta = LocalDate.parse (dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("PASSAGEM");
		Passagem p1 = new Passagem();
		System.out.println("Nome: " + cliente1.getNome() + "\nSobrenome: " 
		+ cliente1.getSobrenome() + "\nNumero do voo: " + voo1.getNumeroVoo() +
		"\nOrigem do voo: " + voo1.getOrigem() + "\nDestino do voo: " 
		+ voo1.getDestino() + "\nPreco do voo: " + voo1.getPreco());
		i++;

		}

	}

}