package com.target.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.persistence.NamedQueries;

/**
 * Entity implementation class for Entity: Cliente
 *
 */
@NamedQueries({@NamedQuery(name="cliente.findByNome",query="SELECT c FROM Cliente c WHERE c.nome like :nome"),
@NamedQuery(name="cliente.findByEndereco", 
query="SELECT c FROM Cliente c LEFT JOIN c.enderecos e WHERE e.Endereco like :endereco"),
@NamedQuery(name="cliente.findByTelefone", query="SELECT c FROM Cliente c LEFT JOIN c.telefones t WHERE t.numero = :numero")})
@Entity
public class Cliente  implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private	int id;

@Column
private	String nome;

@OneToMany(cascade = { CascadeType.PERSIST }, fetch=FetchType.LAZY)
private Collection<Telefone> telefones = new ArrayList<Telefone>();

@OneToMany (cascade = {CascadeType.PERSIST}, fetch=FetchType.EAGER)
private List<Endereco> enderecos = new ArrayList<Endereco>();


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Collection<Telefone> getTelefones() {
	return telefones;
}
public void setTelefones(Collection<Telefone> telefones) {
	this.telefones = telefones;
}
public List<Endereco> getEnderecos() {
	return enderecos;
}
public void setEnderecos(List<Endereco> enderecos) {
	this.enderecos = enderecos;
}	
}
