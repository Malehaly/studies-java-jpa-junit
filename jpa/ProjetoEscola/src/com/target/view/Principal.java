package com.target.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.target.model.Aluno;
import com.target.model.Professor;

public class Principal {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = null;
		EntityManager entitymanager = null;
		
		try{
			//carregar o XML e inicializar as configurações
			emfactory = Persistence.createEntityManagerFactory("ProjetoEscola");
			
			//através de um objeto do tipo EntityManager, 
			//é possível gravar novos objetos no banco
			entitymanager = emfactory.createEntityManager();
			
			//abre transação
			entitymanager.getTransaction().begin();
			
			Aluno aluno = new Aluno();	      
			aluno.setNome("Rogério Souza");
			aluno.setAtivo(true);
				      
			Calendar dataNascimento = new GregorianCalendar();
			dataNascimento.set(Calendar.DAY_OF_MONTH, 11);
			dataNascimento.set(Calendar.MONTH, Calendar.DECEMBER);
			dataNascimento.set(Calendar.YEAR, 1992);
			aluno.setDataNascimento(dataNascimento);
			
			Professor professor = new Professor();	      
			professor.setNome("Tim Maia");
			professor.setAtivo(true);
			professor.setMateria("Fisica");
			professor.setIdade(27);
				      
		//	persiste o aluno no BD
			entitymanager.persist(aluno);
			entitymanager.persist(professor);

			//commit
			entitymanager.getTransaction().commit();

		}catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar persistir os dados.");
			
		} finally {
			entitymanager.close( );
			emfactory.close( );
		}

	}

}

