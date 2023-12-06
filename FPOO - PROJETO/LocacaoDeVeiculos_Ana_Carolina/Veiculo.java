package LocacaoDeVeiculos_Ana_Carolina;

public class Veiculo {
	//atributos
	private String fabricante;
	private String cor;
	private String tipoCombustivel;
    private String modelo;
	private String kmRodados;
    private String ano;
    private boolean disponivel;
    private String placa;
    private int capacidade;
    private double preco;

   
    //construtor com parâmetros
    public Veiculo(String fabricante, String cor, String tipoCombustivel, 
    		String modelo, String kmRodados, String ano, boolean disponivel, String placa,
    		int capacidade, double preco) {
    	this.fabricante = fabricante;
    	this.cor = cor;
    	this.tipoCombustivel = tipoCombustivel;
    	this.modelo = modelo;
        this.kmRodados= kmRodados;
        this.ano = ano;
        this.disponivel = disponivel;
        this.placa = placa;
        this.capacidade = capacidade;
        this.preco = preco;
        
    }

	

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(String kmRodados) {
		this.kmRodados = kmRodados;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double d) {
		this.preco = d;
	}
	
	
	//métodos
	public boolean isDisponivel() {
        return disponivel;
    }

    public void alugar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }

	public void exibirInformacoes() {
		
	}

	

    


}
