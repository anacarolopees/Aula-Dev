package LocacaoDeVeiculos_Ana_Carolina;

//classe Carro: estende classe Veiculo
public class Carro extends Veiculo{
	
    
	// construtor com parâmetros
    public Carro(String fabricante, String cor, String tipoCombustivel, 
        		String modelo, String kmperc, String ano, boolean disponivel, String placa,
        		int capacidade, double preco) {
    	super(fabricante, cor, tipoCombustivel, modelo, kmperc , ano, disponivel, placa, capacidade,preco);
		}

	

    public void exibirInformacoes() {
    	super.exibirInformacoes();
    }
	
    
   }

