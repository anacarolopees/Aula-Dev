package Atividades_Ana_Carolina;

public class Guitarrista extends MembrosBanda{
	public Guitarrista() {
		super.tocar();
	}
	@Override
	public void tocar() {
		System.out.println("O guitarrista esta tocando...");
	}
}
