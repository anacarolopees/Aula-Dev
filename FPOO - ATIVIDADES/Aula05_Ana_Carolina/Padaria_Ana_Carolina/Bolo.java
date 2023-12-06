package Atividades_Ana_Carolina;

public class Bolo extends ProdutoPadaria {
	Bolo(){
		super();
	}
	Bolo(String nome, double preco){
		super.getNome();
		super.getPreco();
	}
	//exibir
	//exibir
		@Override
			public void exibir() {
			System.out.println("SOBRE OS BOLOS ESCOLHIDOS " );
			System.out.println("O nome do primeiro bolo e: " + getNome());
			System.out.println("O preco do primeiro bolo e: " + getPreco());
			System.out.println("O nome do segundo bolo e: " + getNome());
			System.out.println("O preco do segundo bolo e: " + getPreco());
		}

}
