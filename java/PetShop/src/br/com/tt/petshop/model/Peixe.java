package br.com.tt.petshop.model;

import br.com.tt.petshop.tipos.TipoAnimal;

public class Peixe extends Animal {

	@Override
	public TipoAnimal getTipo() {
		return TipoAnimal.PEIXE;
	}

}
