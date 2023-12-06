package Atividades_Ana_Carolina;


public class Cachorro {
	private String nome;
	private float peso;
	private char sexo;
	private int qtdPatas;
	
	public Cachorro() {
		
	}
	public Cachorro(String nome,float peso,char sexo, int patas) {
		this.setNome(nome);
		this.setPeso(peso);
		this.setSexo(sexo);
		this.setQtdPatas(patas);
	}
	
	public void latir() {
		System.out.println("Latindo");
	}
	public void correr() {
		System.out.println("Correndo");
	}
	public void dormir() {
		System.out.println("Dormindo");
	}
	public void brincar() {
		System.out.println("Brincando");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getQtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}
}

