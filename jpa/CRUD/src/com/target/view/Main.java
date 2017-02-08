package com.target.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.target.model.Endereco;
import com.target.model.Cliente;
import com.target.model.Telefone;
import com.target.model.TipoTelefone;

public class Main {

	public static void main(String[] args) {
		
		try{
		//inseriCliente();
		//buscaCliente();
		//buscaClienteQuery();
		//atualizaCliente();
		removeCliente();
		
		} catch(Exception e){
		System.out.println("Error - Can't persist data.");	
		}
	}


	public static void inseriCliente(){
		
		EntityManagerFactory emfactory = null;
		EntityManager entitymanager = null;
		
		emfactory = Persistence.createEntityManagerFactory("crud1");
		entitymanager = emfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();
				

		Telefone t= new Telefone("4444444", TipoTelefone.CELULAR);
		Telefone t1= new Telefone("5555555", TipoTelefone.COMERCIAL);
		Telefone t2= new Telefone("6666666", TipoTelefone.RESIDENCIAL);
		Collection<Telefone> tel = new ArrayList<>();
		tel.add(t);
		tel.add(t1);
		tel.add(t2);
		
		Endereco e = new Endereco("Rua aasdasda, 06");
		Endereco e2 = new Endereco("Rua asdadad, 69");
		List<Endereco> end = new ArrayList<>();
		end.add(e);
		end.add(e2);
		
		Cliente cli = new Cliente();
		cli.setNome("Zeniza All");
		cli.setTelefone(tel);
		cli.setEnderecos(end);
		
		entitymanager.persist(cli);		
		
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
		System.out.println("Cliente inserido!");
		}
	
	
	public static void buscaCliente(){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("crud1");
		EntityManager entitymanager = emfactory.createEntityManager();
		Scanner ler = new Scanner(System.in);		
		
		System.out.println("Buscar o cliente de código:");
		long codigo = Long.parseLong(ler.next());	
		if(entitymanager.find(Cliente.class, codigo) != null){
			
		Cliente cli = entitymanager.find(Cliente.class, codigo);
		System.out.println(cli.getNome());
		}else{
			System.out.println("Codigo inválido");
		}
		ler.close();
	}
	
	public static void buscaClienteQuery(){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("crud1");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Query query = entitymanager.createNamedQuery("query");
		List<Endereco> enderecos = query.getResultList();
		
		for (Endereco e : enderecos){
			System.out.println("Endereco:" + e.getEndereco());
		}
	}
	
	public static void atualizaCliente(){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("crud1");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Informe o código do cliente a atualizar:");
		long codigo = Long.parseLong(ler.nextLine());
		
		Cliente c = entitymanager.find(Cliente.class, codigo);
			System.out.println("O cliente atual do código " + c.getId() + " é " + c.getNome());
		
			System.out.println("Digite a atualização de nome:");
		String novoNome = ler.nextLine();
		c.setNome(novoNome);
		entitymanager.merge(c);
		entitymanager.persist(c);;
		
		Cliente cNovo = entitymanager.find(Cliente.class, codigo);
			System.out.println("O cliente atualizado do código " + cNovo.getId() + " é " + cNovo.getNome());
		
		ler.close();
		entitymanager.getTransaction().commit();
		entitymanager.close();
	}
	
	public static void removeCliente(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o código do cliente:");
		long codigo = Long.parseLong(ler.nextLine());
		
		Cliente c = em.find(Cliente.class, codigo);
		System.out.println("O cliente atual do código " + c.getId() + " é " + c.getNome() + ", acabou de ser removido.");
		
		em.remove(c);
		em.getTransaction().commit();
		em.close();
		ler.close();		
	}
}
	
	
