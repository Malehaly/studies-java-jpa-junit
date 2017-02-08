package br.com.tt.petshop.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.tt.petshop.exception.ValidacaoException;
import br.com.tt.petshop.model.Unidade;

public class UnidadeDAOImpl implements BaseDAO<Unidade, Integer>{

	@Override
	public void salvar(Unidade unidade) throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO tb_unidade (id, nome, endereco) VALUES (");
		sql.append(unidade.getId());
		sql.append(",'");
		sql.append(unidade.getNome());
		sql.append("','");
		sql.append(unidade.getEndereco());
		sql.append("') ");
		
		Connection conexao = ConnectionFactory.getConnection();
		Statement stm = conexao.createStatement();
		stm.execute(sql.toString());
	}

	@Override
	public void remover(Unidade unidade) {
		StringBuffer sql = new StringBuffer();
		sql.append("DELETE FROM tb_unidade WHERE id = ");	
		sql.append(unidade.getId());
		
	}

	@Override
	public Unidade alterar(Unidade unidade) {
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE tb_unidade SET (");	
		sql.append("nome = '");
		sql.append(unidade.getNome());
		sql.append("', endereco = '");
		sql.append(unidade.getEndereco());
		sql.append("') WHERE id = ");
		sql.append(unidade.getId());
		return null;
	}

	@Override
	public List<Unidade> listarTodos() throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT id,nome,endereco FROM tb_unidade");
		
		Connection conexao = ConnectionFactory.getConnection();
		Statement stm = conexao.createStatement();
		
		//RS fica buscando linha a linha da conexao.
		ResultSet rs = stm.executeQuery(sql.toString());
		
		List<Unidade> unidades = new ArrayList<Unidade>();
		while (rs.next()) {
			Unidade unidade = new Unidade();
			unidade.setId(rs.getInt("id"));
			try {
				unidade.setNome(rs.getString("nome"));
				unidade.setEndereco(rs.getString("endereco"));

			} catch (ValidacaoException e) {
				System.out.println("Erro ao ler o registro: "+rs.getInt("id"));			
			}
			unidades.add(unidade);
		}
		//lembrar de fechar na ordem por ultimo aberto - se não o RS não poderá ser fechado.
		rs.close();
		stm.close();		
		return unidades;
	}

	@Override
	public Unidade consultarId(Integer id) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT id,nome,endereco FROM tb_unidade WHERE id = ");
		sql.append(id);
		return null;
	}
	

}
