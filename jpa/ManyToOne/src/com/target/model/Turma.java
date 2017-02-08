package com.target.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="turma")
public class Turma {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codigo;
	@Column(name="nome")
	private String nome;
	@Column(name="total_alunos")
	private int totalAlunos;
	@ManyToOne
	@JoinColumn(name = "SALA_ID")
	private Sala sala;
	
	
	
	public Turma() {

	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTotalAlunos() {
		return totalAlunos;
	}
	public void setTotalAlunos(int totalAlunos) {
		this.totalAlunos = totalAlunos;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	


	
}
