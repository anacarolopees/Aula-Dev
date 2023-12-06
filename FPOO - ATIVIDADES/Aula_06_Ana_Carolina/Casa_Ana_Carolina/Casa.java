package Atividades_Ana_Carolina;

public class Casa {
	//atributos
	private String cor;
	private float preco;
	private float metragem;
	//constr
	public Casa() {
		System.out.println("Voce comprou uma casa.. ");
		
	}
	//param
	public Casa(String cor, float preco, float metragem) {
		this.cor = cor;
		this.preco = preco;
		this.metragem = metragem;
	}
	//get e set
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getMetragem() {
		return metragem;
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	//met esp
	public void mostrarDetalhes() {
		System.out.println("INFOS SOBRE SUA CASA: ");
		System.out.println("----------------------------------------------------------");
		System.out.println("Cor: " + cor);
		System.out.println("Preco: " + preco);
		System.out.println("Metragem: " + metragem);
		




		

	}
}
