package br.com.tiposreferencia;


public class UsandoImpressao {

	public static void main(String[] args) {
		Impressao acessa = new Impressao();
		
		acessa.imprime();
		
		System.out.println("__________________________");
		
		acessa.imprime(10);
		
		System.out.println("__________________________");
		
		acessa.imprime(11, "Os alunos são excelentes");
		
		acessa.imprime(2, "Os alunos são excelentes", "Funcionou");
	
	}
}
