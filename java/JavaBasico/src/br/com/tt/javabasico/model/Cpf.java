package br.com.tt.javabasico.model;

class Cpf {
// default class - visiveis apenas pro pacote
	private String valor;

	//default metodos - visiveis apenas pro pacote tbm, se nao quiser defaultar a classe.
	String getValor() {
		return valor;
	}

	void setValor(String valor) {
		this.valor = valor;
	}
	
}



// POJO , MVC , VO(dto) - design patterns