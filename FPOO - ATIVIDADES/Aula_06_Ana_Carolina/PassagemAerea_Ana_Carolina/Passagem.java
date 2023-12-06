package Atividades_Ana_Carolina;

public class Passagem {
	//att
	private Voo voo;
	private Cliente cliente;
	private double precoTotal;
	//const
	public Passagem () {

	}

	public Passagem (Voo v,Cliente c,double p ) {
		this.voo=v;
		this.cliente=c;
		this.precoTotal=p;

	}

	public Voo getVoo() {
		return voo;

	}
	public void setVoo(Voo voo) {
		this.voo = voo;

	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;

	}

	public Cliente getCliente() {
		return cliente;

	} 

	public double getPrecoTotal() {
		return precoTotal;

	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;

	}
	
	//metodo
	
	public String toString () {
		return ("Cliente" + cliente+ cliente +
				"Numero do Voo" + voo+ 
				"Destino" + voo + 
				"Preco" + voo );

		
	}
	}
