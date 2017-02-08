package br.com.tt.javabasico.model;

public class Pessoa {
	private String nome;
	private static int idade; //atributo static vira compartilhado e único pra todos.
	private Cpf cpf;
	private Parente[] parentes;

	
	// CONSTRUTORES
	// Se cria métodos sem tipos, assim pode chamar um construtor que é um dos método abaixo.
	// o primeiro é o método default, ele está em branco.
	// Caso queria inibir de se criar um método um construtor(método) em branco, por exemplo, 
	// obrigar todas pessoas a terem CPF, então se cria os outros 2 construtores e apaga o
	// construtor padrão, assim nem o default existirá, obrigando sempre a ter parâmetros.
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
	
	// pode-se criar métodos Setters e Getters direto clicando no atributo.	
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