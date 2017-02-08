package com.target.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.target.model.Usuario;

public class UsuarioDAO {

	
	public String getById(long id){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("exercicio1cap6");
		EntityManager entitymanager = emfactory.createEntityManager();
					
		Usuario cli = entitymanager.find(Usuario.class, id);
		String nome = cli.getNome();
		System.out.println("Código localizado: " + id + ", Nome: " + nome);
			
		return nome;
	}
}
