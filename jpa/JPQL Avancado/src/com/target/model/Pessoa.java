package com.target.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
public class  Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PESSOA_ID")
	private int id;

	private String rg;
	private String nome;
	

	public Pessoa() {
		super();
	}
	
	public Pessoa(String rg, String nome) {
		super();
		this.rg = rg;
		this.nome = nome;	
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRg() {
		return this.rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}