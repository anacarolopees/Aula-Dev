package Atividades_Ana_Carolina;

public class Bateirista extends MembrosBanda{
	public Bateirista() {
		super.tocar();
	}
	@Override
	public void tocar() {
		System.out.println("O bateirista esta tocando...");
	}
}
