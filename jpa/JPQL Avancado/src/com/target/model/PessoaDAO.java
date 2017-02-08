package com.target.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PessoaDAO {
	
	public List<Pessoa> list(){

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jqpl");
		EntityManager em = emf.createEntityManager();
		Query query = (Query) em.createNamedQuery("query");
		
		List<Pessoa> pessoa = query.getResultList();
		return pessoa;
	}
	
	public static void addPessoa(){
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("jqpl");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();
		
		Pessoa user = new Pessoa();
		user.setNome("The Spider Boris");
		user.setRg("6969696969");
		entitymanager.persist(user);		
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
		System.out.println("Pessoa inserida!");
		}
	
}
