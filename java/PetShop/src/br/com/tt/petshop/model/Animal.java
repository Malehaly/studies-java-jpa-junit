package br.com.tt.petshop.model;

import br.com.tt.petshop.exception.ValidacaoException;
import br.com.tt.petshop.tipos.TipoAnimal;

public abstract class Animal {
//classe abstrata - pode ter método vazio. vem em classes abstratas e obrigam aos filhos implementar
	
	private int id;
	protected String nome;
	private Unidade unidade;
	private Cliente cliente;
	private Produto[] produtos;

	public Animal(){
		System.out.println("Animal criado!");
	}
	
	public Animal(String nome) throws ValidacaoException{
		this.setNome(nome);
	}
	
	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public void alteraNome(String novoNome) throws ValidacaoException{
		this.setNome(novoNome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws ValidacaoException{
		if(nome == null || nome.equals("")){
			throw new ValidacaoException("Informe um nome para o animal.");
		}
		this.nome = nome;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	@Override
	public String toString() {
		return new StringBuffer()
				.append("Animal  [")
				.append(nome)
				.append(", \n\t")
				.append(cliente.getNome())
				.append(", \n\t")
				.append(unidade.getNome())
				.append("]")
				.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract TipoAnimal getTipo();
}
