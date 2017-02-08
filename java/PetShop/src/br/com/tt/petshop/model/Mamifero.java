package br.com.tt.petshop.model;

import br.com.tt.petshop.tipos.TipoAnimal;

public class Mamifero extends Animal {

	private Vacina[] vacinas;

	public Vacina[] getVacinas() {
		return vacinas;
	}

	public void setVacinas(Vacina[] vacinas) {
		this.vacinas = vacinas;
	}

	@Override
	public TipoAnimal getTipo() {
		return TipoAnimal.MAMIFERO;
	}
}
