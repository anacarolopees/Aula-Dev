package Atividades_Ana_Carolina;

import java.util.Scanner;

public class Vaso {//classe pai
	Scanner entrada = new Scanner (System.in);
	//atributos
	private String cor;
	private double tamanho;
	private String material;
	//construtor
	public Vaso(String string, double d, String string2) {
		super();
	}
	public Vaso() {
		super();
	}
	//get and set
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor= cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho= tamanho;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	//metodo especial
	public void ExibirVaso() {
		System.out.println("Cor do vaso: " + this.cor );
		System.out.println("Tamanho do vaso: " + this.tamanho );
		System.out.println("Material do vaso: " + this.material );


	}
	
	

}
