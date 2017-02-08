package com.target.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<Endereco> enderecos = new ArrayList<Endereco>();
		
	@OneToMany(cascade={CascadeType.ALL})
	private Collection<Telefone> telefone = new ArrayList<Telefone>();
	
	@Column(name="nome")
	private String nome;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(Collection<Telefone> telefone) {
		this.telefone = telefone;
	}
	
	
	
}
