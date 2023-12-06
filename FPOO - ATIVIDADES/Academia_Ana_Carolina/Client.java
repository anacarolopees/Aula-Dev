package Atividades_Ana_Carolina;

public class Client {
		double cpf;
		String nome ;
		double telefone;
		int idade;
		public double altura;
		public double peso;
		public double imc;
		public double pesometa;
		public double imprimir;
	
	public double getcpf () {
		return cpf;
		}

		public String getnome () {
		return nome;
		}

		public double settelefone () {
		return cpf;
		}
		
		public int getidade () {
		return idade;
		}

		public double setaltura () {
		return altura;
		}

		public double setpeso () {
		return peso;
		}

		public double imc() {
			double imcc = peso/(altura*altura) ;
			System.out.println("Seu imc e:"+ imcc);

		if (imcc< 18.5) {
			System.out.println("Magreza");
		}else if (imc> 25) {
			System.out.println("Sobrepeso");
		}else {
			System.out.println("Ideal");
		}
		return imc; }
		public void pesometa () {
			double perder = peso - pesometa;
			System.out.println("Voce precisa emagrecer " + perder + "Kg");
		}
		public void imprimir () {
			System.out.println("Cpf do cliente " + cpf);
			System.out.println("Nome do cliente " + nome);
			System.out.println("Telefone do cliente " + telefone);
			System.out.println("Idade do cliente " + idade);
			System.out.println("Altura do cliente " + altura);
			System.out.println("Peso do cliente " + peso);
			System.out.println("Imc do cliente " + imc);
			System.out.println("Peso desejado do cliente " + pesometa);


		}

		
	}
