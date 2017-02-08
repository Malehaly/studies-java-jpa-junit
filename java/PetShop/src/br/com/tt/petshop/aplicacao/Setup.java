package br.com.tt.petshop.aplicacao;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.tt.petshop.dao.ConnectionFactory;

public class Setup {

	public static void main(String[] args) throws Exception {
		try{
		new File("banco.db").delete(); //remove banco
		} catch (Exception e){ //sem banco.
		}
		criaTabelas(); //recria tabelas.
	}
	
	public static void criaTabelas() throws Exception{
		StringBuffer sql = new StringBuffer();
		sql.append("CREATE TABLE tb_animal (nome VARCHAR(100), id_unidade INTEGER, ");
		sql.append("cpf_cliente VARCHAR(14), tipo VARCHAR(10), peconhento BOOLEAN ); ");
		executa(sql.toString());
		
		sql = new StringBuffer();
		sql.append("CREATE TABLE tb_unidade (id INTEGER, nome VARCHAR(100), endereco VARCHAR(200)); ");
		executa(sql.toString());
		
		sql = new StringBuffer();
		sql.append("CREATE TABLE tb_cliente (cpf VARCHAR(14), nome VARCHAR(100), tipo VARCHAR(20)); ");
		executa(sql.toString());
		
	
		
	}
	public static void executa(String sql) throws SQLException {	
	//aqui cria uma conexão com o banco.
	Connection conexao = ConnectionFactory.getConnection();
	//aqui cria o statement, aonde edita as info.
	Statement stm = conexao.createStatement();
	stm.execute(sql.toString());
	System.out.println("Tabelas criadas.");
	}
}
