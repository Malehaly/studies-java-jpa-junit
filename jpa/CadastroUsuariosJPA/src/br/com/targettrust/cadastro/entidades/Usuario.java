package br.com.targettrust.cadastro.entidades;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="usuario", uniqueConstraints=@UniqueConstraint(columnNames={"id", "cpf"}))
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="nome", nullable=false, length=40, updatable=true)
	private String nome;
	
	@Column(name="rg", nullable=false, length=10, updatable=true)
	private int rg;
	
	@Column(name="cpf", nullable=false, length=14, updatable=true)
	private String cpf;
	
	@Column(name="data_nascimento", nullable=true, length=10, updatable=true)
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@Column(name="estado_civil", nullable=true, length=10, updatable=true)
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;
	
	
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
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
}
