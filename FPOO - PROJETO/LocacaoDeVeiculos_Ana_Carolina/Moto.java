package LocacaoDeVeiculos_Ana_Carolina;

public class Moto extends Veiculo{
	//atributos
    private String motor;
    private int cilindrada;
    private String chassi;

    //construtor com parâmetros
    public Moto(String fabricante, String cor, String tipoCombustivel, 
    		String modelo, String kmRodados, String ano, boolean disponivel, String placa,
    		int capacidade, double preco, String motor, int cilindrada, String chassi) {
		super(fabricante, cor, tipoCombustivel, modelo, kmRodados , ano, disponivel, placa, capacidade,preco);

	}
    //get e set
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	


}
