package Atividades_Ana_Carolina;

import java.util.Scanner;

public class VasoDecorado extends Vaso{
	Scanner entrada = new Scanner (System.in);
	//atributos
	public String decoracao;
	
	//construtor
	public VasoDecorado() {
		super();
	}
	
	//get e set
	public String getDecoracao() {
		return decoracao;
	}
	public void setDecoracao(String decoracao) {
		this.decoracao = decoracao;
	}
	
	//metodo especial (tamanho, cor, material)
		public void ExibirVaso() {
			System.out.println("Decoracao do vaso: " + decoracao);
			System.out.println("Cor do vaso: " + super.getCor());
			System.out.println("Tamanho do vaso: " + super.getTamanho() );
			System.out.println("Material do vaso: " + super.getMaterial());
		}
		
	

}
