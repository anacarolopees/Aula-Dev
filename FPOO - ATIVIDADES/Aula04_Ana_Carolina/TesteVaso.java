package Atividades_Ana_Carolina;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteVaso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Vaso vasimples = new Vaso ();
		Vaso vasimples1 = new Vaso ();
		//escrevendo vaso simples
		System.out.println("------ESCREVA AS INFORMACOES DO VASO SIMPLES-------");
		System.out.println("Escreva a cor: ");
		vasimples.setCor(entrada.next());
		System.out.println("Escreva o tamanho: ");
		vasimples.setTamanho(entrada.nextDouble()); //double
		System.out.println("Escreva o material: ");
		vasimples.setMaterial(entrada.next());
	
		//escrevendo vaso decorado
		VasoDecorado vasfr = new VasoDecorado ();
		System.out.println("------ESCREVA AS INFORMACOES DO VASO DECORADO-------");
		System.out.println("Escreva a cor: ");
		vasfr.setCor(entrada.next());
		System.out.println("Escreva o tamanho: ");
		vasfr.setTamanho(entrada.nextDouble());; //double
		System.out.println("Escreva o material: ");
		vasfr.setMaterial(entrada.next());
		System.out.println("Escreva a decoracao: ");
		vasfr.setDecoracao(entrada.next());
		
		
		//info vaso pai
		System.out.println("------INFORMACOES VASO SIMPLES-------");
		// instanciando vaso pai
		
		vasimples.ExibirVaso();
		
		//info vaso decorado
		System.out.println("------INFORMACOES VASO DECORADO-------");
		vasfr.ExibirVaso();
		
		

	}

}
