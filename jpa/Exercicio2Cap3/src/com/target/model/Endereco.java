package com.target.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="endereco", uniqueConstraints=@UniqueConstraint(columnNames={"id", "codigo_postal"}))
public class Endereco implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="rua", nullable=false, length=40, updatable=true)
	private String rua;
	
	@Column(name="numero", nullable=false, updatable=true)
	private int numero;
	
	@Column(name="complemento", nullable=true, length=20, updatable=true)
	private String complemento;
	
	@Column(name="codigo_postal", nullable=false, length=40, updatable=true)
	private CodigoPostal codigoPostal;
	
	@Column(name="bairro", nullable=false, length=40, updatable=true)
	private Bairro bairro;
	
	@Column(name="cidade", nullable=false, length=40, updatable=true)
	private Cidade cidade;

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public CodigoPostal getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(CodigoPostal codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	
}
