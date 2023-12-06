package LocacaoDeVeiculos_Ana_Carolina;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
	//atributos
	private String contrato;
	private Cliente cliente;
	private List <Veiculo> veiculosDisponiveis; 
    private List <Veiculo> veiculos;

	//construtor padrão
	public Locadora() {
		veiculosDisponiveis = new ArrayList<>(); 

		
	}
	//construtor com parâmetros
	public Locadora(String contrato, String veiculoAlugado,
		Cliente cliente ) {
		this.contrato = contrato;

		this.cliente = cliente;
	}
	
	//métodos getters and setters
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Veiculo> getVeiculos() {
	return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
	this.veiculos = veiculos;
	}
	public List <Veiculo> getVeiculosDisponiveis() {
		return veiculosDisponiveis;
	}
	public void setVeiculosDisponiveis(List <Veiculo> veiculosDisponiveis) {
		this.veiculosDisponiveis = veiculosDisponiveis;
	}
	
	//métodos da classe
	public void verVeiculosDisponiveis() {
		System.out.println("Veículos disponíveis:");
        for (Veiculo veiculo : veiculos) {
           if (veiculo.isDisponivel()) {
                System.out.println(veiculo.getFabricante() + " " + veiculo.getModelo() + 
                " (" + veiculo.getAno() + ")" + veiculo.getCor() + veiculo.getCapacidade() + veiculo.getPreco());
               
            }
        }
	}
	public void adicionarVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	
}


