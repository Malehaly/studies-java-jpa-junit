package br.com.tt.petshop.dao;

import java.sql.SQLException;
import java.util.List;

//não é classe! é interface!
public interface BaseDAO<ENTITY, TIPOID> {
//ENITY - entidade - vira uma classe que pode ser salva em banco. no BD é usado entidades
	
	public void salvar(ENTITY entidade) throws SQLException ;
	
	public void remover(ENTITY entidade) throws SQLException;
	
	public ENTITY alterar (ENTITY entidade) throws SQLException;
	
	public List<ENTITY> listarTodos() throws SQLException;
	
	public ENTITY consultarId (TIPOID id) throws SQLException;
	//aqui como iria buscar uma ID / PK que pode ser qualquer tipo, entao coloca mais um argumento
	//na interface para que alem de informar o tipo de classe, tbm informar o tipo da PK.
}
