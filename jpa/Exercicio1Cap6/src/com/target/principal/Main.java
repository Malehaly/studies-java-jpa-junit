package com.target.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.target.dao.UsuarioDAO;
import com.target.model.Endereco;
import com.target.model.Usuario;

public class Main {

	public static void main(String[] args) {
		
		try{
		System.out.println("Informe o que deseja fazer com o usuário: Inserir, Buscar, Atualizar ou Remover.");
		Scanner metodo = new Scanner(System.in);
		metodo.nextLine();
		
		switch (metodo.toString().toLowerCase()) {
		case "inserir":
			inseriCliente();
			break;
		case "buscar":
			buscaCliente();
			break;
		case "atualizar":
			atualizaCliente();
			break;
		case "remover":
			removeCliente();
			break;
		default:
			System.out.println("Repita operacão.");
		}
		metodo.close();
		//inseriCliente();
		//buscaCliente();
		//buscaClienteQuery();
		//atualizaCliente();
		//removeCliente();
		
		} catch(Exception e){
		System.out.println("Error - Can't persist data.");	
		}
	}


	public static void inseriCliente(){
		
		EntityManagerFactory emfactory = null;
		EntityManager entitymanager = null;
		
		emfactory = Persistence.createEntityManagerFactory("exercicio1cap6");
		entitymanager = emfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();
		
		Endereco e = new Endereco("Rua sgjklhlhj, 06");
		Endereco e2 = new Endereco("Rua qarad, 69");
		List<Endereco> end = new ArrayList<>();
		end.add(e);
		end.add(e2);
		
		Usuario user = new Usuario();
		user.setNome("The Spider Boris");
		user.setEmail("aaees@aeae.com.br");
		user.setEndereco(end);
		
		entitymanager.persist(user);		
		
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
		System.out.println("Usuário inserido!");
		}
	
	
	public static void buscaCliente(){
		Scanner ler = new Scanner(System.in);		
		System.out.println("Informe o id do usuario a ser localizado:");
		long valor = Long.parseLong(ler.nextLine());
		UsuarioDAO userFind = new UsuarioDAO();
		userFind.getById(valor);
		System.out.println("Usuario localizado: " + userFind.getById(valor));
		ler.close();	
	}
	/*public static void buscaCliente(){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("exercicio1cap6");
		EntityManager entitymanager = emfactory.createEntityManager();
		Scanner ler = new Scanner(System.in);		
		
		System.out.println("Buscar o usuário de código:");
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
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("exercicio1cap6");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Query query = entitymanager.createNamedQuery("query");
		List<Endereco> enderecos = query.getResultList();
		
		for (Endereco e : enderecos){
			System.out.println("Endereco:" + e.getEndereco());
		}
	}*/
	
	public static void atualizaCliente(){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("exercicio1cap6");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Informe o código do usuário a atualizar:");
		long codigo = Long.parseLong(ler.nextLine());
		
		Usuario user = entitymanager.find(Usuario.class, codigo);
			System.out.println("O usuário atual do código " + user.getId() + " é " + user.getNome());
		
			System.out.println("Digite a atualização de nome:");
		String novoNome = ler.nextLine();
		user.setNome(novoNome);
		entitymanager.merge(user);
		entitymanager.persist(user);;
		
		Usuario userNovo = entitymanager.find(Usuario.class, codigo);
			System.out.println("O cliente atualizado do código " + userNovo.getId() + " é " + userNovo.getNome());
		
		ler.close();
		entitymanager.getTransaction().commit();
		entitymanager.close();
	}
	
	public static void removeCliente(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio1cap6");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o código do usuário:");
		long codigo = Long.parseLong(ler.nextLine());
		
		Usuario user = em.find(Usuario.class, codigo);
		System.out.println("O usuário atual do código " + user.getId() + " é " + user.getNome() + ", acabou de ser removido.");
		
		em.remove(user);
		em.getTransaction().commit();
		em.close();
		ler.close();		
	}
}
	
	
