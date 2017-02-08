package com.targettrust.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="animais", uniqueConstraints=@UniqueConstraint(columnNames={"id", "apelido"}))
public class Animal {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="apelido", nullable=false, length=40, updatable=true)
	private String apelido;
	
	@Column(name="peso", nullable=true, length=5, updatable=true)
	private Float peso;
	
	@Column(name="altura", nullable=true, length=5, updatable=true)
	private Integer altura;
	
	@Column(name="vivo", nullable=true, length=1, updatable=true)
	private boolean vivo;
	
	@Transient
	private Integer imc;
	
	@Column(name="birth")
	@Temporal(TemporalType.DATE)
	private Calendar birth;
	
	public Animal (){		
	}
	
	public Calendar getBirth() {
		return birth;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public Integer getImc() {
		return imc;
	}
	public void setImc(Integer imc) {
		this.imc = imc;
	}
	
	
}
