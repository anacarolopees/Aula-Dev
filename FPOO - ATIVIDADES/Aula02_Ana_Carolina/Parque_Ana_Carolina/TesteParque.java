package Atividades_Ana_Carolina;

import java.util.Scanner;

public class TesteParque {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Brinquedo brin = new Brinquedo();
		brin.setnome();
		brin.setalturaMinima();
		brin.setcapacidadeMaxima();
		Visitante vis = new Visitante();
		vis.setnome(null);
		vis.setidade(0);
		vis.setaltura();
		vis.podeAndarNoBrinquedo();


	}

	
}
