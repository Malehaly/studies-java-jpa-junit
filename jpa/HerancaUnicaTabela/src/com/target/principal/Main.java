package com.target.principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.target.model.Aluno;
import com.target.model.Cliente;
import com.target.model.Pessoa;
import com.target.model.Professor;


public class Main {

	public static void main(String[] args) {

		
		EntityManagerFactory emfactory = null;
		EntityManager entitymanager = null;
		
		try{
			emfactory = Persistence.createEntityManagerFactory("heranca1");
			entitymanager = emfactory.createEntityManager();
			
			entitymanager.getTransaction().begin();
			
			Pessoa pessoa = new Pessoa();
			entitymanager.persist(pessoa);
			
			Aluno aluno = new Aluno();
			entitymanager.persist(aluno);
			
			Cliente cli = new Cliente();
			entitymanager.persist(cli);
			
			Professor pro = new Professor();
			entitymanager.persist(pro);		
				
			
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
