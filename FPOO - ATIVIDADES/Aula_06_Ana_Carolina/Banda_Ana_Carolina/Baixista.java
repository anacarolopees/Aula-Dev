package Atividades_Ana_Carolina;

public class Baixista extends MembrosBanda{
	public Baixista() {
		super.tocar();
	}
	@Override
	public void tocar() {
		System.out.println("O baixista esta tocando...");
	}
}
