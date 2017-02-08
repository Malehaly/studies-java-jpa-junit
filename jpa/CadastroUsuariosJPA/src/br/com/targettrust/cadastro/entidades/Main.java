package br.com.targettrust.cadastro.entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		
		EntityManagerFactory emfactory = null;
		EntityManager entitymanager = null;
		
		try{
			//carregar o XML e inicializar as configura��es
			emfactory = Persistence.createEntityManagerFactory("CadastroUsuariosJPA");
			
			//atrav�s de um objeto do tipo EntityManager, 
			//� poss�vel gravar novos objetos no banco
			entitymanager = emfactory.createEntityManager();
			
			//abre transa��o
			entitymanager.getTransaction().begin();
			
			Usuario us = new Usuario();
			us.setCpf("123.123.123-23");
			us.setEstadoCivil(EstadoCivil.CASADO);
			us.setNome("Jacinto Pinto");
			us.setRg(241414412);
			Calendar dataNascimento = new GregorianCalendar();
			dataNascimento.set(Calendar.DAY_OF_MONTH, 11);
			dataNascimento.set(Calendar.MONTH, Calendar.DECEMBER);
			dataNascimento.set(Calendar.YEAR, 1992);
			us.setDataNascimento(dataNascimento);
			
			entitymanager.persist(us);
			entitymanager.getTransaction().commit();
						
		}catch(Exception e){			
			System.out.println("Error - Can't persist data.");
		}finally{
			entitymanager.close();
			emfactory.close();
		}
	}	
}

