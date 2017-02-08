package com.target.principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.target.model.Aluno2;
import com.target.model.Cliente2;
import com.target.model.Pessoa2;
import com.target.model.Professor2;

public class Main {

	public static void main(String[] args) {

		
		EntityManagerFactory emfactory = null;
		EntityManager entitymanager = null;
		
		try{
			emfactory = Persistence.createEntityManagerFactory("heranca2");
			entitymanager = emfactory.createEntityManager();
			
			entitymanager.getTransaction().begin();
					
			
			Pessoa2 pessoa2 = new Pessoa2();
			entitymanager.persist(pessoa2);
			
			Aluno2 aluno2 = new Aluno2();
			entitymanager.persist(aluno2);
			
			Cliente2 cli2 = new Cliente2();
			entitymanager.persist(cli2);
			
			Professor2 pro2 = new Professor2();
			entitymanager.persist(pro2);	
			
			//Endereco end = new Endereco();
			//end.setRua("Rua Alfredo Jaconi");
			//end.setNumero(244);
			//end.setCodigoPostal(cp);
			//end.setBairro(bai);
			//end.setCidade(cid);
			//entitymanager.persist(end);
			
			entitymanager.getTransaction().commit();
						
		}catch(Exception e){			
			System.out.println("Error - Can't persist data.");
		}finally{
			entitymanager.close();
			emfactory.close();
		}
	}
	
	
}