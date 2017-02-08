package com.target.prinpal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.loader.plan.build.internal.returns.EncapsulatedEntityIdentifierDescription;
import org.hibernate.sql.ordering.antlr.Factory;

import com.target.model.Endereco;
import com.target.model.Instrutor;

public class Main {

	
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf= null;
		EntityManager em=null;
		try {
			
			emf=Persistence.createEntityManagerFactory("Exercicio1Cap4");
			em=emf.createEntityManager();
			
			
	em.getTransaction().begin();
			
			
			Endereco endereco= new Endereco();
			endereco.setBairro("sdksd");
			endereco.setCidade("tramandai");
			endereco.setCodigoPostal("354");
			endereco.setComplemento(34838473);
			endereco.setRua("laranjeiras");
			endereco.setNumero(45);
			
			Instrutor instrutor= new Instrutor();
			
			instrutor.setEmail("sdlkweo");
			instrutor.setEndereco(endereco);
			instrutor.setMatricula(67);
			instrutor.setNome("djsdkdjs");
			instrutor.setTelefone("38472837238");
			
			em.persist(instrutor);
			
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar persistir os dados.");
		}finally {
			em.close();
			emf.close();
		
		}

	}

}
