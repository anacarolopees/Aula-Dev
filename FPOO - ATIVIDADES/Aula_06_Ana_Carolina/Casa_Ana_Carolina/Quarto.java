package Atividades_Ana_Carolina;

public class Quarto extends Comodo{
	//att
	private int numeroCamas;
	//const
	public Quarto() {
		
	}
	//param
	public Quarto(int numeroCamas) {
		this.numeroCamas=numeroCamas;
		super.getNome();
	}

	public int getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

}
