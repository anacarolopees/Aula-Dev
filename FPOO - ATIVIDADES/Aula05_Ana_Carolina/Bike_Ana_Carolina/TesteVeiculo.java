package Atividades_Ana_Carolina;

import java.util.Scanner;

import Aula_1206.Person;

public class TesteVeiculo {

	public static void main(String[] args) {
		//instanciando objetos
		Scanner entrada = new Scanner (System.in);
		Person p1 = new Person();
		
		
		System.out.println("Digite o nome do primeiro ciclista: ");
		p1.nome = entrada.next();	
		System.out.println("Escolha a bike desejada");
		System.out.println("1 - SpeedBike");
		System.out.println("2 - MountainBike");
		int i = 0;
		i= entrada.nextInt();
		switch(i) {
		case (1):
			System.out.println("Voce escolheu a SpeedBike");
		break;
		case (2):
			System.out.println("Voce escolheu a MountainBike");
			break;
		}
		Veiculo b1 = new SpeedBike();
		Veiculo b2 = new MountainBike();
		System.out.println(p1.nome + " subiu na bike");
		System.out.println(p1.nome + " comecou a pedalar");
		System.out.println("Qual a marcha desejada?");
		b1.mudarMarcha();
		b1.acelerar();
		System.out.println("Qual a velocidade da bike:");
		b1.setVelocidade(entrada.next());
		b1.frear();
		System.out.println("Qual a velocidade da bike:");
		b1.setVelocidade(entrada.next());
		b1.estado();

		Person p2 = new Person();
		System.out.println("Digite o nome do segundo ciclista: ");
		p2.nome = entrada.next();
		p1.nome = entrada.next();	
		System.out.println("Escolha a bike desejada");
		System.out.println("1 - SpeedBike");
		System.out.println("2 - MountainBike");
		int i = 0;
		i= entrada.nextInt();
		switch(i) {
		case (1):
			System.out.println("Voce escolheu a SpeedBike");
		break;
		case (2):
			System.out.println("Voce escolheu a MountainBike");
			break;
		}

		System.out.println(p1.nome + " subiu na bike");
		System.out.println(p1.nome + " comecou a pedalar");
		System.out.println("Qual a marcha desejada?");
		b2.mudarMarcha();
		b2.acelerar();
		System.out.println("Qual a velocidade da bike:");
		b2.setVelocidade(entrada.next());
		b2.frear();
		System.out.println("Qual a velocidade da bike:");
		b2.setVelocidade(entrada.next());
		b2.estado();
	}

}
