package com.target.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries(value={@NamedQuery(name = "endereco.list", query="SELECT e FROM Endereco e"),
@NamedQuery(name = "endereco.count", query = "SELECT count(e) FROM Endereco e"),})
@Entity
@NamedQuery(name="query", query="SELECT e FROM Endereco e")
public class Endereco implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String Endereco;
	
	
	public Endereco (){		
	}
	public Endereco( String endereco) {		
		Endereco = endereco;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
}
