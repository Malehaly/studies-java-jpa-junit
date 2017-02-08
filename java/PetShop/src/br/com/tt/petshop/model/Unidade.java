package br.com.tt.petshop.model;

import br.com.tt.petshop.exception.ValidacaoException;

public class Unidade {

	private int id;
	private String nome;
	private String endereco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws ValidacaoException {
		if(nome == null || nome.equals("")){
		// if(nome.equals("") || nome == null){ --> SEMRPE TESTAR CASOS NULL NA FRENTE. se por acaso,
		// conseguissem por nome = null e ele fosse para o teste comparando com uma string ""...
		// assim daria null pointer exception.
			throw new ValidacaoException("Informe um nome para unidade!");
			//throw new Exception("COD123");
		}		

		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) throws ValidacaoException {
		if(endereco == null || endereco.equals("")){
			throw new ValidacaoException("Informe um endereço para unidade!");
		}		

		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return new StringBuffer()
				.append("Unidade [")
				.append(nome)
				.append(",")
				.append(endereco)
				.append("]")
				.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
