package Atividades_Ana_Carolina;

import java.util.Scanner;

public class Aluno extends Pessoa{

	//attributes
	private String curso;
	private float nota;
	public float media;
	//constructor
	Aluno () {
			super();	
	}
	Aluno (String nome, String endereco, int telefone, int cpf, int celular, String curso, float nota) {
		super.getNome();
		super.getEndereco();		
		super.getTelefone();
		super.getCpf();
		super.getCelular();
		this.curso = curso;
		this.nota = nota;
	}
	
	//get and set
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
	//method especial
	public void calcularMedia() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a primeira nota:");
		float nota = entrada.nextFloat();
		System.out.println("Digite a segunda nota:");
		float nota1 = entrada.nextFloat();
		float media = ((nota + nota1)/2);
		System.out.println("Sua media e:" + media);
	}
	public void situacaoFinal() {
		if(media >= 7) {
			System.out.println("O aluno passou de ano:)");
		}
		else if (media < 7) {
		System.out.println("O aluno repetiu de ano:(");
		}
	}
	

}
