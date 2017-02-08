package br.com.tt.javabasico.aplicacoes;

import br.com.tt.javabasico.model.Pessoa;
import br.com.tt.javabasico.util.Utils;

public class Aplicacoes1 {
// lembrar: nome de classe singular
// ctrl + d = apaga ln toda
// ver lista de atalhos: ctrl shift l; ver lista e preferencias: 2 vezes ctrl shift l;
	
	//técnica de sobrescrita(=overrideing) -> copia um método IDENTICO ao de uma classe pai.
	//no caso do finalize, todo objeto do java possui métodos da classe pai Object.
	//finalize libera os dados pelo GC.
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize");
	}
	
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Pedro", 69);
		//pessoa1.setNome("Joao");
		//pessoa1.setIdade(45);
		pessoa1.setNumeroCpf("025.525.232-23");
		
		
		String nome = pessoa1.getNome();
		System.out.println(nome);
		
		int idade = pessoa1.getIdade();
		System.out.println(idade);
		
		String cpf = pessoa1.getNumeroCpf();
		System.out.println(cpf);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setIdade(24);
		pessoa2.setNome("Kiko");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa1.getIdade());
		//colocando static na variavel idade da classe pessoa, assim ela vira um atributo compartilhado
		
		
		//usando static em método da classe utils criada por nós:
		
		//forma1:
		//Utils log = new Utils();
		//log.log("Pessoa 1 tera um nome:");
		
		//forma2
		//new Utils().log("Pessoa 1 tera um nome:");
		
		//forma 3 com static:
		Utils.log("Pessoa 1 tera um nome: " +pessoa1.getNome());
	
	
	
	}

}
