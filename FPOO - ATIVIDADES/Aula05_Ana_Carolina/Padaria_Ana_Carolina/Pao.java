package Atividades_Ana_Carolina;

public class Pao extends ProdutoPadaria {
	//tipo especifico, por isso criei a classe
	Pao(){
		super();
	}
	Pao(String nome, double preco){
		super.getNome();
		super.getPreco();
	}
	//exibir
	@Override
		public void exibir() {
		System.out.println("SOBRE OS PAES ESCOLHIDOS " );
		System.out.println("O nome do primeiro pao e: " + getNome());
		System.out.println("O preco do primeiro pao e: " + getPreco());
		System.out.println("O nome do segundo pao e: " + getNome());
		System.out.println("O preco do segundo pao e: " + getPreco());
	}
}
