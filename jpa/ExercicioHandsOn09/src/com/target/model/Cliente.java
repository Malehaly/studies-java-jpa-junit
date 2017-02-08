package com.target.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.persistence.NamedQueries;

/**
 * Entity implementation class for Entity: Cliente
 *
 */

@NamedQueries(value={@NamedQuery(name="Cliente.list", query="select c from Cliente c"),
@NamedQuery(name="Cliente.listLikeNome", query="select c from Cliente c where c.nome like :nome")})
//@NamedQuery(name="pessoa.listByName", query="select p from Pessoa p where p.nome = :name")

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Cliente extends Pessoa implements Serializable {

	@Column(length=24)
	private String cnpj;
	
	private static final long serialVersionUID = 1L;

	public Cliente() {
		super();
	}

	
	public Cliente(String rg, String nome, Collection<Telefone> telefones,
			List<Endereco> enderecos, String cnpj) {
		super(rg, nome, telefones, enderecos);
		this.cnpj = cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
   
	
	
}
