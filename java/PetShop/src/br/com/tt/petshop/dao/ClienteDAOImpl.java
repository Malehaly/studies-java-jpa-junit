package br.com.tt.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.tt.petshop.exception.CpfException;
import br.com.tt.petshop.exception.ValidacaoException;
import br.com.tt.petshop.model.Cliente;
import br.com.tt.petshop.tipos.TipoCliente;

//poderia ser chamado tbm de AnimalBD ou AnimalRepository - nomes padroes para acesso a sistemas
public class ClienteDAOImpl implements BaseDAO<Cliente, String>, ConsultaNomeDAO<Cliente> {
//pode implementar quantas Interfaces quiser...
	
	@Override
	public void salvar(Cliente cliente) throws SQLException{
		//TODO implementar persistencia - avisa no task algo a ser melhorado.
		// ainda existe o FIXME - que avisa no tasks casos de bug.
		
		//modelo padrão - CRUD - create, retrieve, update, delete. 
		//modelo para inserir em sql os dados no bd:
		//insert into TABELA (CAMPOS) values (VALORES)
		
		//modelo1:
/*		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO tb_cliente (cpf,nome,tipo) VALUES (");
		sql.append("'"); //como cpf é string, se passa ele entre aspas simples 'cpf'
		sql.append(cliente.getCpf());
		sql.append("'");
		sql.append(",");
		sql.append("'");
		sql.append(cliente.getNome());
		sql.append("'");
		sql.append(",");
		//se usa o .name pra poder pegar o tipo do enum e passar para string.
		sql.append("'");
		sql.append(cliente.getTipo().name());
		sql.append("'");
		sql.append(") ");*/
		
		//modelo2:
		String sql = "INSERT INTO tb_cliente (cpf,nome,tipo) VALUES (?, ?, ?)";
		Connection conexao = ConnectionFactory.getConnection();
		PreparedStatement stm = conexao.prepareStatement(sql.toString());
		stm.setString(1, cliente.getCpf());
		stm.setString(2, cliente.getNome());
		stm.setString(3, cliente.getTipo().name());
		stm.execute();
		
		
		
	}

	@Override
	public void remover(Cliente cliente) {
		//DELETE FROM tabela WHERE oqueapagar -> (exemplo: WHERE ID = NULL.)
		StringBuffer sql = new StringBuffer();
		sql.append("DELETE FROM tb_cliente WHERE cpf = ");	
		sql.append("'");
		sql.append(cliente.getCpf());
		sql.append("'");
	}

	@Override
	public Cliente alterar(Cliente cliente) {
		//UPDATE tabela SET camposAAlterar WHERE aonde
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE tb_cliente SET (");	
		sql.append("nome = '");
		sql.append(cliente.getNome());
		sql.append("', tipo = '");
		sql.append(cliente.getTipo().name());
		sql.append("') WHERE cpf = '");
		sql.append(cliente.getCpf());
		sql.append("'");		
		return null;
	}

	@Override
	public List<Cliente> listarTodos() throws SQLException {
		//SELECT campos* FROM tabela [WHERE ?]
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT cpf,nome,tipo FROM tb_cliente");	//sem where - puxa tudo
		
		Connection conexao = ConnectionFactory.getConnection();
		Statement stm = conexao.createStatement();
		
		//RS fica buscando linha a linha da conexao.
		ResultSet rs = stm.executeQuery(sql.toString());
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		while (rs.next()) {
			Cliente cliente = new Cliente();
			try {
				cliente.setCpf(rs.getString("cpf"));
				cliente.setNome(rs.getString("nome"));
			} catch (ValidacaoException | CpfException e) {
				System.out.println("Erro ao ler o cliente CPF: "+ rs.getString("cpf"));			
			}
			cliente.setTipo(TipoCliente.valueOf(rs.getString("tipo")));

			clientes.add(cliente);
		}
		//lembrar de fechar na ordem por ultimo aberto - se não o RS não poderá ser fechado.
		rs.close();
		stm.close();		
		return clientes;
	}

	
	/** 
	 * Consultar por CPF
	 */
	@Override
	public Cliente consultarId(String cpf) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT cpf,nome,tipo FROM tb_cliente WHERE cpf = '");
		sql.append(cpf);
		sql.append("'");
		return null;
	}

	//vindo de outra interface exclusiva para cliente, animal;
	@Override
	public Cliente consultaNome(String nome) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT cpf,nome,tipo FROM tb_cliente WHERE nome = '");
		sql.append(nome);
		sql.append("'");
		return null;
	}
	
}
