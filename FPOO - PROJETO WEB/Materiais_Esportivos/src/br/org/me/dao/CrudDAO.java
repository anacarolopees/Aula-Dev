package br.org.me.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.org.me.model.Produto;
import br.org.me.controller.Conexao;


	public class CrudDAO  {

		public void create(Produto produto) {
			String sql = "INSERT INTO produtoss(nome, categoria, preco) VALUES(?, ?, ?)";
			Connection conn = null;
			PreparedStatement p =null;
			try {
	conn= Conexao.criandoConexao();
	p = (PreparedStatement) conn.prepareStatement(sql);
	p.setString(1, produto.getNome());
	p.setString(2, produto.getCategoria());
	p.setInt(3, produto.getPreco());
	p.execute();
	}catch(Exception e) {
	JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO:"+ e);
	}finally {
	try {
	if(p != null);
	p.close();
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	}
	public void update(Produto produto) {
	
	String sql = "UPDATE produtoss SET Nome = ?, Categoria = ?, Preco = ? WHERE Nip= ?";
	Connection conn = null;
	PreparedStatement p = null;
	try {
	conn = Conexao.criandoConexao();
	p = (PreparedStatement) conn.prepareStatement(sql);
	p.setInt(1, produto.getNip());
	p.setString(2, produto.getNome());
	p.setString(3, produto.getCategoria());
	p.setInt(4, produto.getPreco());
	p.execute();
	JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!");
	System.out.println("Dados atualizados com sucesso!!");
	}catch(Exception e) {
	JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO:"+ e);
	}finally {
	try {
	if(p != null);
	p.close();
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	}
	
	
	public List<Produto> read() {
	List <Produto> produtos = new ArrayList <Produto>();
	String sql = "SELECT * FROM produtoss";
	Connection conn = null;
	PreparedStatement p = null;
	ResultSet resultado = null;
	try {
	conn= Conexao.criandoConexao();
	p = (PreparedStatement) conn.prepareStatement(sql);
	resultado = p.executeQuery();
	while(resultado.next()) {
	Produto ver_produto = new Produto();
	ver_produto.setNip(resultado.getInt("nip"));
	ver_produto.setNome(resultado.getString("nome"));
	ver_produto.setCategoria(resultado.getString("categoria"));
	ver_produto.setPreco(resultado.getInt("preco"));
	produtos.add(ver_produto);
	}
	}catch(Exception e) {
	JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO:"+ e);
	}finally {
	try {
	if(p != null);
	p.close();
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	return produtos;
	}
	public boolean delete(int nip) {
	String sql ="DELETE FROM materiais_esportivos WHERE nip = ?";
	Connection conn = null;
	PreparedStatement p= null;
	try {
	conn = Conexao.criandoConexao();
	p = (PreparedStatement) conn.prepareStatement(sql);
	p.setInt(1, nip);
	p.execute();
	JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
	System.out.println("Dados excluidos com sucesso!");
	}catch(Exception e) {
	JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO:"+ e);
	}finally {
	try {
	if(p != null);
	p.close();
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	return false;
	}
}