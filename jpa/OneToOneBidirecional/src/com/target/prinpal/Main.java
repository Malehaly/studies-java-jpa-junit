package com.target.prinpal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf= null;
		EntityManager em=null;
		try {
			
			emf=Persistence.createEntityManagerFactory("OneToOneBidirecional");
			em=emf.createEntityManager();
			
			

		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar persistir os dados.");
		}finally {
			em.close();
			emf.close();
		
		}

	}

}
