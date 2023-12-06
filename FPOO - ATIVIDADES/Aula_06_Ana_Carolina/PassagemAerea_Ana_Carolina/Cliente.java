package Atividades_Ana_Carolina;

public class Cliente {
	//att
	private String nome;
	private String sobrenome;
	private String email;
		
	//const
	Cliente(){
		
	}
	Cliente(String nome, String sobrenome, String email){
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setEmail(email);

		}

		//get set
		public String getNome() {
			return this.nome;

		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return this.sobrenome;

		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;

		}

		public String getEmail() {
			return this.email;

		}

		public void setEmail(String email) {
			this.email = email;

		}

		

	}
