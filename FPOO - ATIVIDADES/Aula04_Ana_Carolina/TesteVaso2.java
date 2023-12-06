package Atividades_Ana_Carolina;

import java.util.Scanner;
import java.util.ArrayList

public class TesteVaso2 extends Vaso {
	public static void main(String[] args) {
		
		// arrayList para armazenar objetos vaso
        ArrayList<Vaso> listaDeVasos = new ArrayList<>();
        // adicionando objetos vaso na lista
        listaDeVasos.add(new Vaso("Vermelho", 30.5, "Ceramica"));
        listaDeVasos.add(new Vaso("Preto", 28.5, "Vidro"));
        listaDeVasos.add(new Vaso("Azul", 20.9, "Plástico"));
        // exibindo os vasos na lista
        for (Vaso vaso : listaDeVasos) {
        	System.out.println(vaso);
        }
        }
	
