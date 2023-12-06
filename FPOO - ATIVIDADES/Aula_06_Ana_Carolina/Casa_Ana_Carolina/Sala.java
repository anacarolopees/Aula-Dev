package Atividades_Ana_Carolina;

public class Sala extends Comodo{
	private boolean temTv;
	//const
	public Sala() {
		
	}
	//param
	public Sala (boolean temTv) {
		this.temTv = temTv;
		super.getNome();
	}

	public boolean TemTv(int i) {
		if (i == 1) {
			System.out.println("Ha uma tv na casa");
		}
		else {
			System.out.println("Nao ha tvs em casa.");
		}
		return temTv;
	}

	public void setTemTv(boolean temTv) {
		this.temTv = temTv;
	}
	
	
	
	
}
