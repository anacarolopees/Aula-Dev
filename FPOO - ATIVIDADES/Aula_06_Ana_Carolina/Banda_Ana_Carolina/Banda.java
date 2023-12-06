package Atividades_Ana_Carolina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banda {
	Scanner entrada = new Scanner(System.in);
	//atributos
	private String nome;
	private List <MembrosBanda> membros;

	//construtores
	public Banda() {
		
	}
	public Banda(String nome, List<MembrosBanda> membros) {
		this.nome=nome;
		this.membros = membros;
	}
	//get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public List <MembrosBanda> getMembros() {
		return membros;
	}
	public void setMembros(List <MembrosBanda> membros) {
		this.membros = membros;
	}
	
	public void adicionarMembro() {
		MembrosBanda membroEspecial = new MembrosBanda();
		System.out.println("Qual o nome do novo membro: ");
		membroEspecial.setNome(entrada.next());
		ArrayList<MembrosBanda> listinha = new ArrayList<MembrosBanda>();
		listinha.add(membroEspecial);
		
	}

	public void realizarShow() {
		System.out.println("A banda " + nome  + "esta dando um show!!!");
	}
	
}
