package Atividades_Ana_Carolina;

public class Professor extends Pessoa{
	//attributes
	private String nomeCurso;
	private float salario;
	
	//constructor
	public Professor () {
		super();	
	}
	
	public Professor (String nome, String endereco, int telefone, int cpf, int celular, String nomeCurso, float salario) {
		super.getNome();
		super.getEndereco();		
		super.getTelefone();
		super.getCpf();
		super.getCelular();
		this.nomeCurso = nomeCurso;
		this.salario = salario;
	}
	
	//get and set

	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	

}
