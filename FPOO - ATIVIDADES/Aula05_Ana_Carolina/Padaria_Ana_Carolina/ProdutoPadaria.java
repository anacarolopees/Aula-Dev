package Atividades_Ana_Carolina;

public class ProdutoPadaria implements Produto {
	public String nome;
	public double preco;
	
	public ProdutoPadaria() {
		
	}
	public ProdutoPadaria(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	//met imp
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPreco() {//double
		return preco;
	}
	@Override
	public void setNome(String n) {
		this.nome = n;
	}

	@Override
	public void setPreco(double p) {
		this.preco = p;
	}
	
	//met proprio
	public void exibir( ) {
		System.out.println("O nome do produto e: " + nome );
		System.out.println("O preco do produto e: " + preco );
	}

}
