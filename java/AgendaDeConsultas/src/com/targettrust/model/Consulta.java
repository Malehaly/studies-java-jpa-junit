package com.targettrust.model;

import java.util.Date;

public class Consulta {
	
	private String animal;
	private Date dataConsulta;
	private Boolean cancelada;
	private Double preco;
	
	public Consulta(){
		
	}
	
		
	public Consulta(String animal, Date dataConsulta, Boolean cancelada, Double preco) {
		super();
		this.animal = animal;
		this.dataConsulta = dataConsulta;
		this.cancelada = cancelada;
		this.preco = preco;
	}


	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public Boolean getCancelada() {
		return cancelada;
	}
	public void setCancelada(Boolean cancelada) {
		this.cancelada = cancelada;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	

}
