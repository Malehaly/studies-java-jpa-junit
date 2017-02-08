package com.target.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PessoaDAO {

	public  void list() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("queryes");
		EntityManager em = factory.createEntityManager();
		Query query = (Query) em.createNamedQuery("pessoa.list");
		List<Pessoa> pessoa = query.getResultList();

		for (Pessoa p : pessoa) {
			System.out.println("Nome Da Pessoa: " + p.getNome());
		}
		/*Alterado tipo de retorno e adicionado foreach para mostrar*/
	}	
	
	public  void list2() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("queryes");
		EntityManager em = factory.createEntityManager();
		Query query = (Query) em.createNamedQuery("pessoa.listLikeNome");
		List<Pessoa> pessoa = query.getResultList();

		for (Pessoa p : pessoa) {
			System.out.println("Nome Da Pessoa: " + p.getNome());
		}		
		/*Alterado tipo de retorno e adicionado foreach para mostrar*/
	}

	public void adicionaPessoa() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("queryes");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Pessoa p = new Pessoa();
		p.setNome("xxxxx");
		p.setRg("15515");
		em.persist(p);
		
		Pessoa q = new Pessoa();
		q.setNome("Alfredo");
		q.setRg("Jamaica");
		em.persist(q);		
		
		em.getTransaction().commit();
		em.close();
		System.out.println("Clientes OK");
	}
}
