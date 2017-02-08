package com.target.apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.target.model.Aluno;
import com.target.model.Bairro;
import com.target.model.Cidade;
import com.target.model.CodigoPostal;
import com.target.model.Endereco;
import com.target.model.Estado;
import com.target.model.Pais;
import com.target.model.TipoCodigoPostal;

public class Fabrica {

	public static void main(String[] args) {

		
		EntityManagerFactory emfactory = null;
		EntityManager entitymanager = null;
		
		try{
			emfactory = Persistence.createEntityManagerFactory("Exercicio2Cap3");
			entitymanager = emfactory.createEntityManager();
			
			entitymanager.getTransaction().begin();
			
			Pais pais = new Pais();
			pais.setNome("Uganda");
			pais.setSigla("UGN");
			entitymanager.persist(pais);
			
			Estado estado = new Estado();
			estado.setNome("Jumanji");
			estado.setSigla("JMJ");
			estado.setPais(pais);			
			entitymanager.persist(estado);
			
			Cidade cid = new Cidade();
			cid.setNome("Anta Gorda");
			cid.setEstado(estado);
			entitymanager.persist(cid);
			
			Bairro bai = new Bairro();
			bai.setNome("Ipiranga");
			entitymanager.persist(bai);
			
			CodigoPostal cp = new CodigoPostal();
			cp.setNumero(89089L);
			cp.setTipo(TipoCodigoPostal.CEP);
			entitymanager.persist(cp);
			
			Endereco end = new Endereco();
			end.setRua("Rua Alfredo Jaconi");
			end.setNumero(244);
			end.setCodigoPostal(cp);
			end.setBairro(bai);
			end.setCidade(cid);
			entitymanager.persist(end);
			
			
			Aluno aluno = new Aluno();
			aluno.setCpf("123.123.123-23");
			aluno.setApelido("Otaviano Alas");
			aluno.setEndereco(end);
			
			entitymanager.persist(aluno);
			
			entitymanager.getTransaction().commit();
						
		}catch(Exception e){			
			System.out.println("Error - Can't persist data.");
		}finally{
			entitymanager.close();
			emfactory.close();
		}
	}	
}
