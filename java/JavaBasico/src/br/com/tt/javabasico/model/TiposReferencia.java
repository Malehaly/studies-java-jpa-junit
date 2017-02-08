package br.com.tt.javabasico.model;

public class TiposReferencia {

	public static void main(String[] args){
		
		Cpf pessoa1 = new Cpf();
		System.out.println("Pessoa1: " +pessoa1);
		
		pessoa1.setValor("025.424.090-99");
		System.out.println("Pessoa1: " +pessoa1);
		System.out.println("Pessoa1: " +pessoa1.getValor());
		
		Cpf pessoa2 = new Cpf();
		pessoa2.setValor("890.474.190-96");
		System.out.println("Pessoa2: " +pessoa2);
		System.out.println("Pessoa2: " +pessoa2.getValor());
		
		Cpf pessoa3 = pessoa1;
		pessoa3.setValor("023-230-030-01");
		System.out.println("Pessoa3: " +pessoa3); // aloca a mesma referencia que pessoa1
		System.out.println("Pessoa3: " +pessoa3.getValor()); 		
		System.out.println("--> Pessoa1: " +pessoa1);
		System.out.println("--> Pessoa1: " +pessoa1.getValor());
		//o pessoa 3 aponta para o mesmo local de memoria do java, assim, alterando qualquer um deles
		// ira alterar o mesmo valor...
		
		Cpf pessoa4 = null; // aqui s� est� definido, sem estar estanciado.
		System.out.println(pessoa4); //dar� null
		//System.out.println(pessoa4.valor); //dar� o erro NULL POINTER EXCEPTION
		
		
		// objeto � toda referencia alocada em memoria no java. sento que pessoaX � uma variavel
		// que estar� instanciada/referenciada quando alocada para esse local. 
		// na hora que desloca a variavel para fora de um objeto, o objeto ser� apagado pelo GC
		// caso nao tenha nenhuma variavel referenciando ele.
		// um objeto pode ter varias variaveis.
	}
	
}
