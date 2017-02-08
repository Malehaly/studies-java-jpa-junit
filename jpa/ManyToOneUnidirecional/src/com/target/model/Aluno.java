package com.target.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="nome")
	private String nome;
	

	@OneToMany(mappedBy="aluno")
	private Collection<InteresseCurso> interesses=new ArrayList<InteresseCurso>();
	
	


	public Aluno() {
	}


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


	public Collection<InteresseCurso> getInteresses() {
		return interesses;
	}


	public void setInteresses(Collection<InteresseCurso> interesses) {
		this.interesses = interesses;
	} 
	
	
	

}
