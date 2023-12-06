package Atividades_Ana_Carolina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteBanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//instanciando objetos
		Banda banda = new Banda();
		Vocalista v1 = new Vocalista();
		Baixista bai1 = new Baixista();
		Bateirista bat1 = new Bateirista();
		Guitarrista g1 = new Guitarrista();
		//codigoooooooooooo
		System.out.println("Coloque o nome da banda: ");
		banda.setNome(entrada.next());
		System.out.println("Coloque os nomes dos membros da banda: ");
		System.out.println("Vocalista: ");
		v1.setNome(entrada.next());
		System.out.println("Baixista: ");
		bai1.setNome(entrada.next());
		System.out.println("Bateirista: ");
		bat1.setNome(entrada.next());
		System.out.println("Guitarrista: ");
		g1.setNome(entrada.next());
		
		List<MembrosBanda> membros = new ArrayList<MembrosBanda>();
		membros.add(v1);
		membros.add(bai1);
		membros.add(bat1);
		membros.add(g1);
		
		
		System.out.println("Quer add um novo membro : " ); 
		System.out.println("1----------Sim");
		System.out.println("2----------Nao"); 
		int i = entrada.nextInt();
		if(i == 1) {
			Baixista g2 = new Baixista();
			System.out.println("Coloque o nome do novo membro: ");
			g2.setNome(entrada.next());

		}
		
		//fazendo a banda FUNCIONAR.
		for(MembrosBanda me : membros ) {//tipo, obj p ler a lista, sua lista 
			System.out.println("O nome dos membros sao: " + me.getNome());
		}
		v1.tocar();
		bai1.tocar();
		bat1.tocar();
		g1.tocar();
		banda.realizarShow();
	}

}
