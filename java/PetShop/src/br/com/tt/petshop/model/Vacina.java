package br.com.tt.petshop.model;

import java.util.Calendar;

public class Vacina {

	private Calendar data;
	private String nome;

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
