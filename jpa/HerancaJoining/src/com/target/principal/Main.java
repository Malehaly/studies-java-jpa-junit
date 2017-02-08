package com.target.principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.target.model.Aluno3;
import com.target.model.Cliente3;
import com.target.model.Pessoa3;
import com.target.model.Professor3;

public class Main {

	public static void main(String[] args) {

		
		EntityManagerFactory emfactory = null;
		EntityManager entitymanager = null;
		
		try{
			emfactory = Persistence.createEntityManagerFactory("heranca3");
			entitymanager = emfactory.createEntityManager();
			
			entitymanager.getTransaction().begin();
					
			
			Pessoa3 pessoa3 = new Pessoa3();
			pessoa3.setEndereco("Rua venancio 247");
			pessoa3.setNome("Otaviano Pessoa");
			pessoa3.setTelefone("051 99999999");
			entitymanager.persist(pessoa3);
			
			Aluno3 aluno3 = new Aluno3();
			aluno3.setApelido("Olavio");
			aluno3.setEndereco("Rua venancio 247");
			aluno3.setNome("Olavio Jamaica");
			aluno3.setTelefone("051 99999999");
			entitymanager.persist(aluno3);
			
			Cliente3 cli3 = new Cliente3();
			cli3.setNome("Budapeste");
			cli3.setCnpj("023 02323 203023");
			entitymanager.persist(cli3);
			
			Professor3 pro3 = new Professor3();
			pro3.setNome("Jessica Alba");
			pro3.setPisPasep("2414241414");
			pro3.setSalario(2440);
			entitymanager.persist(pro3);	
			
			entitymanager.getTransaction().commit();
						
		}catch(Exception e){			
			System.out.println("Error - Can't persist data.");
		}finally{
			entitymanager.close();
			emfactory.close();
		}
	}
	
	
}