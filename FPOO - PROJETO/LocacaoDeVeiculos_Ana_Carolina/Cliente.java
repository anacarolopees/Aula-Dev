package LocacaoDeVeiculos_Ana_Carolina;

public class Cliente {
	//atributos
    private String nome;
    private String endereco;
    private String telefone;
    private double CPF;
    private double idade;
    private double CNH;
    private String veiculo;
    private float pagarDiaria;
    
    //construtor padrão
    public Cliente() {
    	
    }
   
    //com parâmetros
    public Cliente(String nome, String endereco, String telefone, int CPF, int idade, 
    		int CNH, String veiculo, float pagarDiaria) {
    	this.nome=nome;
    	this.endereco=endereco;
    	this.telefone=telefone;
    	this.CPF=CPF;
    	this.idade=idade;
    	this.CNH=CNH;
    	this.veiculo=veiculo;
    	this.pagarDiaria=pagarDiaria;
    }
    
    //get e set
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getCNH() {
		return CNH;
	}

	public void setCNH(int cNH) {
		CNH = cNH;
	}
	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	public float getPagarDiaria() {
		return pagarDiaria;
	}

	public void setPagarDiaria(float pagarDiaria) {
		this.pagarDiaria = pagarDiaria;
	}
	
	
	
	public void alugarVeiculo(Veiculo veiculo) {
        if (veiculo.isDisponivel()) {
            veiculo.alugar();
            System.out.println(nome + " alugou o veiculo " + "com placa " + veiculo.getPlaca() + " do valor " +
            veiculo.getPreco() + " do ano " + veiculo.getAno() + " com a capacidade de " + veiculo.getCapacidade() 
            + " com a cor " + veiculo.getCor() + " do fabricante " + veiculo.getFabricante()
              		+ ".");
        } else {
            System.out.println("Desculpe, o veículo com placa " + veiculo.getPlaca() + " não está disponível para aluguel.");
        }
    }

    public void pagarDiaria(Veiculo veiculo, double valorDiaria) {
        if (veiculo.isDisponivel()) {
              System.out.println(nome + " pagou a diária de " + valorDiaria + " pelo veículo com placa " + veiculo.getPlaca());
          } else {
              System.out.println("O veículo com placa " + veiculo.getPlaca() + " não está alugado.");
          }

    }

	
    	
    
    
	
}




	
	
	
	
	
	

