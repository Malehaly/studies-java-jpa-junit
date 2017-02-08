package com.targettrust.apl;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.targettrust.model.Animal;

public class Menu {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emfactory = null;
		EntityManager entitymanager = null;
		
		try{
			//carregar o XML e inicializar as configurações
			emfactory = Persistence.createEntityManagerFactory("Animais");
			
			//através de um objeto do tipo EntityManager, 
			//é possível gravar novos objetos no banco
			entitymanager = emfactory.createEntityManager();
			
			//abre transação
			entitymanager.getTransaction().begin();
			
			Animal animal = new Animal();			
			animal.setAltura(150);
			animal.setApelido("Rex");
			animal.setImc(50);
			animal.setPeso(4.0f);
			animal.setVivo(true);
			
			Calendar dataNascimento = new GregorianCalendar();
			dataNascimento.set(Calendar.DAY_OF_MONTH, 11);
			dataNascimento.set(Calendar.MONTH, Calendar.DECEMBER);
			dataNascimento.set(Calendar.YEAR, 1992);
			animal.setBirth(dataNascimento);
			
			entitymanager.persist(animal);
			entitymanager.getTransaction().commit();
						
		}catch(Exception e){			
			System.out.println("Error - Can't persist data.");
		}finally{
			entitymanager.close();
			emfactory.close();
		}
		


}
	
}
