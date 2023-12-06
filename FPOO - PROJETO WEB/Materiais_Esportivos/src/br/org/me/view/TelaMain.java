package br.org.me.view;

import javax.swing.JOptionPane;
import br.org.me.dao.*;
import br.org.me.model.Produto;

public class TelaMain {

	public static void main(String[] args) {
		CrudDAO inserir_produto = new CrudDAO();
		Produto produto1 = new Produto();

		
		int opcao;
		do {
			String opcao2= JOptionPane.showInputDialog("\n 0--Mostrar tabela \n 1--Adicionar Produto \n 2--Atualizar Produto \n 3--Deletar Produto \n 4--Sair");
			opcao =Integer.parseInt(opcao2);
			switch (opcao) {
			case 0:
				for (Produto vassoura : inserir_produto.read()) {
				JOptionPane.showMessageDialog(null,"Nip:"+ vassoura.getNip()+ " Nome:"+ vassoura.getNome()+ " Categoria:"+ vassoura.getCategoria()+ " Preco:"+ vassoura.getPreco());
				}
			break;
				
			case 1:
				
				String i1= JOptionPane.showInputDialog("Nome:");
				produto1.setNome(i1);
				String d= JOptionPane.showInputDialog("Categoria:");
				produto1.setCategoria(d);
				String g= JOptionPane.showInputDialog("Preco:");
				int x = Integer.parseInt(g);
				produto1.setPreco(x);
				inserir_produto.create(produto1);
				JOptionPane.showMessageDialog(null,"Nome:"+ produto1.getNome()+ ", Categoria:"+ produto1.getCategoria()+ ", Preco:"+ produto1.getPreco());
				
				break;
			case 2:
				for (Produto vassoura : inserir_produto.read()) {
					JOptionPane.showMessageDialog(null,"Nome:"+ produto1.getNome()+ ", Categoria:"+ produto1.getCategoria()+ ", Preco:"+ produto1.getPreco());
				}
				
				String i2= JOptionPane.showInputDialog("Escolha pelo Nip quem deseja modificar:");
				int z = Integer.parseInt(i2);
				produto1.setNip(z);
				
				 i1= JOptionPane.showInputDialog("Nome:");
				 produto1.setNome(i1);
				
				 d= JOptionPane.showInputDialog("Categoria:");
				 produto1.setCategoria(d);
				
				 g= JOptionPane.showInputDialog("Preco:");
				 int f = Integer.parseInt(g);
				 produto1.setPreco(f);
				
				inserir_produto.update(produto1);
				break;
			case 3:
				for (Produto vassoura : inserir_produto.read()) {
					JOptionPane.showMessageDialog(null,"Nome:"+ produto1.getNome()+ ", Categoria:"+ produto1.getCategoria()+ ", Preco:"+ produto1.getPreco());
				}
				i2= JOptionPane.showInputDialog("Escolha o Nip do livro a ser deletado:");
				int o = Integer.parseInt(i2);
				inserir_produto.delete(o);

				break;
			default:
				JOptionPane.showMessageDialog(null,"Escolha as Opcoes");
				break;
			}
			
		}while(opcao != 4);
		
	}
	
}
