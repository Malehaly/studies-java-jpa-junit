package br.com.tt.petshop.dao;

import java.util.List;

import br.com.tt.petshop.model.Animal;
import br.com.tt.petshop.model.Mamifero;
import br.com.tt.petshop.model.Peixe;
import br.com.tt.petshop.model.Reptil;
import br.com.tt.petshop.tipos.TipoAnimal;

//poderia ser chamado tbm de AnimalBD ou AnimalRepository - nomes padroes para acesso a sistemas
public class AnimalDAOImpl implements BaseDAO<Animal, Integer>, ConsultaNomeDAO<Animal>{
//pode implementar quantas Interfaces quiser...
	
	//o uso do override é util pro dev, pois ele indica quando nao esta subescrevendo errado.
	@Override
	public void salvar(Animal animal){
		//TODO implementar persistencia - avisa no task algo a ser melhorado.
		// ainda existe o FIXME - que avisa no tasks casos de bug.
	}

	@Override
	public void remover(Animal entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Animal alterar(Animal entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Animal> listarTodos() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT nome,id_unidade,cpf_cliente,tipo,peconhento FROM tb_animal");
		TipoAnimal tipo = null;
		switch (tipo) {
		case MAMIFERO:
			new Mamifero();
			break;

		case REPTIL:
			new Reptil();
			break;
			
		case PEIXE:
			new Peixe();
			break;
		}
		
		return null;
	}

	@Override
	public Animal consultarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	//vindo de outra interface exclusiva para cliente, animal;
	@Override
	public Animal consultaNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
