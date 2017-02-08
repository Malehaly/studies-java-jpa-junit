package br.com.tt.petshop.model;

import br.com.tt.petshop.exception.ValidacaoException;
import br.com.tt.petshop.tipos.TipoAnimal;

public class Reptil extends Animal{

	public Reptil(){
		super();
		System.out.println("Reptil criado!");
	}
	
	public Reptil(String nome) throws ValidacaoException{
		super(nome);
	}
		
	private Boolean peconhento;

	public Boolean isPeconhento() {
		return this.peconhento;
	}

	public void setPeconhento(Boolean peconhento) {
		this.peconhento = peconhento;
	}

	public void alteraNomeEPeconhento(String novoNome, Boolean peconhento) throws ValidacaoException{
		this.alteraNome(novoNome);
		this.peconhento = peconhento;
	}
	
	@Override
	public void alteraNome(String novoNome) throws ValidacaoException {
		if(novoNome.equalsIgnoreCase("Rex")){
			throw new ValidacaoException ("Não use Rex!");
		}

		//Não modifica a instância original
		final String copiaNome = novoNome;
		super.alteraNome(copiaNome);
	}

	@Override
	public TipoAnimal getTipo() {
		return TipoAnimal.REPTIL;
	}
}
