package com.target.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="interesses_cursos")
public class InteresseCurso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="interesses_id")
	private int id;
	@OneToOne
	private Curso curso;
	
	@Column(name="dataPreferencial")
	@Temporal(TemporalType.DATE)
	private Calendar dataPreferencial;
	
	@Column(name="dataLimite")
	@Temporal(TemporalType.DATE)
	private Calendar dataLimite;
	
	@Column(name="periodoPreferencial")
	private String  periodoPreferencial;
	
	@ManyToOne()
	private Aluno aluno;
	
	
	
	
	
	public InteresseCurso() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Calendar getDataPreferencial() {
		return dataPreferencial;
	}
	public void setDataPreferencial(Calendar dataPreferencial) {
		this.dataPreferencial = dataPreferencial;
	}
	public Calendar getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(Calendar dataLimite) {
		this.dataLimite = dataLimite;
	}
	public String getPeriodoPreferencial() {
		return periodoPreferencial;
	}
	public void setPeriodoPreferencial(String periodoPreferencial) {
		this.periodoPreferencial = periodoPreferencial;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	

}
