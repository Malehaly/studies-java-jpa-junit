package com.target.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="codigo_postal", uniqueConstraints=@UniqueConstraint(columnNames={"numero"}))
public class CodigoPostal implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="numero")
	private long numero;
	
	@Column(name="tipo", nullable=false, length=20, updatable=true)
	@Enumerated(EnumType.STRING)
	private TipoCodigoPostal tipo;

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public TipoCodigoPostal getTipo() {
		return tipo;
	}

	public void setTipo(TipoCodigoPostal tipo) {
		this.tipo = tipo;
	}

}
