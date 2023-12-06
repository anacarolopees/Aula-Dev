package Atividades_Ana_Carolina;

public class Doce extends ProdutoPadaria {
	Doce(){
		super();
	}
	Doce(String nome, double preco){
		super.getNome();
		super.getPreco();
	}
	//exibir
	//exibir
		@Override
			public void exibir() {
			System.out.println("SOBRE OS DOCES ESCOLHIDOS " );
			System.out.println("O nome do primeiro doce e: " + getNome());
			System.out.println("O preco do primeiro doce e: " + getPreco());
			System.out.println("O nome do segundo doce e: " + getNome());
			System.out.println("O preco do segundo doce e: " + getPreco());
		}
}
