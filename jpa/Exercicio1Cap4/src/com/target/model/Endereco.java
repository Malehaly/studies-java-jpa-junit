package com.target.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="endereco")
public class Endereco  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="endereco_id")
	private long id;
	
	@Column(name="rua",length=120)
	private String rua;
	@Column(name="numero")
	private int numero;
	@Column(name="complemento")
	private int complemento;
	
	@Column(name="cidade")
	private String cidade;
	@Column(name="bairro")
	private String bairro;
	@Column(name="cod_postal")
	private String codigoPostal;
	
	
	
	
	
	public Endereco() {

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
	public int getComplemento() {
		return complemento;
	}
	public void setComplemento(int complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	

}
