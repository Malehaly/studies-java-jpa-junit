package br.com.tt.javabasico.model;

public class Pessoa {
	private String nome;
	private static int idade; //atributo static vira compartilhado e �nico pra todos.
	private Cpf cpf;
	private Parente[] parentes;

	
	// CONSTRUTORES
	// Se cria m�todos sem tipos, assim pode chamar um construtor que � um dos m�todo abaixo.
	// o primeiro � o m�todo default, ele est� em branco.
	// Caso queria inibir de se criar um m�todo um construtor(m�todo) em branco, por exemplo, 
	// obrigar todas pessoas a terem CPF, ent�o se cria os outros 2 construtores e apaga o
	// construtor padr�o, assim nem o default existir�, obrigando sempre a ter par�metros.
	public Pessoa(){
	}
	
	public Pessoa(String nome){
		//lembrando: this se refere aos atributos desta classe.
		this.nome = nome;
	}
	
	public Pessoa(String nome, int idade){
		this.nome=nome;
		this.idade=idade;
	}
	// FIM CONSTRUTORES
	
	class Parente{
		private String grauParentesco;
		private Pessoa pessoa;		
	}
	
	// pode-se criar m�todos Setters e Getters direto clicando no atributo.	
	public void setNome(String a){
		nome = a;		
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setIdade(int a){
		idade = a;		
	}
	
	public int getIdade(){
		return idade;
	}

	public void setNumeroCpf(String c) {
		cpf = new Cpf();
		cpf.setValor(c);
	}
	
	public String getNumeroCpf() {
		return cpf.getValor();
	}
	
}