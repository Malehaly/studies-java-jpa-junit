package com.target.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaClasses {

	public static void main(String[] args) {
		EntityManagerFactory emf= null;
		EntityManager em=null;
		try {
			
			emf=Persistence.createEntityManagerFactory("nova");
			em=emf.createEntityManager();
			
			

		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar persistir os dados.");
		}finally {
			em.close();
			emf.close();
		
		}

	}

}
