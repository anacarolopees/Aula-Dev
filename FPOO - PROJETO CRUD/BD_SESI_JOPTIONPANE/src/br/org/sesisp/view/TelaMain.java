package br.org.sesisp.view;

import javax.swing.JOptionPane;
import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;

public class TelaMain {

	public static void main(String[] args) { 
		CrudDAO inserir_aluno = new CrudDAO();
		Aluno aluno1 = new Aluno();

		/*

		aluno1.setNome("José");
		aluno1.setIdade(17);
		inserir_aluno.create(aluno1);
		System.out.println("Nome:"+ aluno1.getNome()+ " Idade:"+ aluno1.getIdade());

		

		

		aluno1.setNome("Marcelo Vieira");

		aluno1.setIdade(18);

		aluno1.setRa(1);

		inserir_aluno.update(aluno1);

		System.out.println("Nome:"+ aluno1.getNome()+ " Idade:"+ aluno1.getIdade());

		

		for (Aluno vassoura : inserir_aluno.read()) {

			System.out.println(vassoura.getRa()+ ","+ vassoura.getNome()+ "," + vassoura.getIdade());

		}

		CrudDAO remover_aluno = new CrudDAO();

		remover_aluno.delete(2);

		*/

		int opcao;

		do {

			String opcao2= JOptionPane.showInputDialog("\n 0--Mostrar tabela \n 1--Adicionar Aluno \n 2--Atualizar Aluno \n 3--Reorganizar Alunos \n 4--Deletar Aluno");

			opcao =Integer.parseInt(opcao2);

			switch (opcao) {

			case 0:

				for (Aluno vassoura : inserir_aluno.read()) {

					JOptionPane.showMessageDialog(null,vassoura.getRa()+ ","+ vassoura.getNome()+ "," + vassoura.getIdade());

				}

				break;

				

			case 1:

				String n= JOptionPane.showInputDialog("Nome:");

				aluno1.setNome(n);

				String i1= JOptionPane.showInputDialog("Idade:");

				int i = Integer.parseInt(i1);

				aluno1.setIdade(i);

				inserir_aluno.create(aluno1);

				JOptionPane.showMessageDialog(null,"Nome:"+ aluno1.getNome()+ " Idade:"+ aluno1.getIdade());

				

				break;

			case 2:

				for (Aluno vassoura : inserir_aluno.read()) {

					JOptionPane.showMessageDialog(null,vassoura.getRa()+ ","+ vassoura.getNome()+ "," + vassoura.getIdade());

				}

				String i2= JOptionPane.showInputDialog("RA:");

				int ra = Integer.parseInt(i2);

				aluno1.setRa(ra);

				n= JOptionPane.showInputDialog("Nome:");

				aluno1.setNome(n);

				i1= JOptionPane.showInputDialog("Idade:");

				i = Integer.parseInt(i1);

				aluno1.setIdade(i);

				inserir_aluno.update(aluno1);

				break;

			case 3:

				

				break;

			case 4:

				for (Aluno vassoura : inserir_aluno.read()) {

					JOptionPane.showMessageDialog(null,vassoura.getRa()+ ","+ vassoura.getNome()+ "," + vassoura.getIdade());

				}

				i2= JOptionPane.showInputDialog("Escolha o RA do aluno a ser deletado:");

				ra = Integer.parseInt(i2);

				CrudDAO remover_aluno = new CrudDAO();

				remover_aluno.delete(ra);

				break;

			default:

				JOptionPane.showMessageDialog(null,"Escolha as Opcoes");

				break;

			}

			

		}while(opcao != 5);

		

	}

	

}