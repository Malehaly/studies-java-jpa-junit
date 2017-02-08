package br.com.tt.javabasico.primitivos;

public class TiposPrimitivos {

	public static void main (String[] args){
	// comando "main" + ctrl+espaço+enter - cria direto uma funcao main 	
		
		
		char letra = 'c';		
		char unicode = '\u0060';		
		char maiuscula = Character.toUpperCase(letra);		
		Character caracterClasse = '1';
		
		System.out.println(letra);
		System.out.println(unicode);
		System.out.print(maiuscula);
		System.out.println(caracterClasse);		
		// template - "sysout" + ctrl + espaço - cria direto a linha system.out.print
		
		
		
		boolean falso = false;
		boolean verdadeiro = true;
		Boolean falsoClasse = null;
		Boolean verdadeiroClasse = true;
		Boolean falsoMesmoClasse = false;
		
		System.out.println(falso);
		System.out.println(verdadeiro);
		System.out.println(falsoClasse);
		System.out.println(verdadeiroClasse);
		System.out.println(falsoMesmoClasse);
		// boolean - primitivo
		// Boolean - classe - assim existem 3 valores para boolean através da classe Wrapper
		
		
		
		int idade = 27;
		byte diaMes = 31;
		short ano = 2007;
		long quantTweets = 409697l;
		float valorTotal = 56.90f;
		double codigoBarras = 987929292992999d;
		
		System.out.println(idade + " " + diaMes + " " + ano);
		System.out.println(codigoBarras + " " + quantTweets + " " + valorTotal);
		System.out.println(idade - 15);
		System.out.println(valorTotal/10);	
		System.out.println(quantTweets/100f);
		//por convencao, se usa o 'd' atrás de numero double, mesmo pra long e pra numero float
		
		
		
		String nome = "João";
		System.out.println(nome);
		System.out.println(nome.toUpperCase());
		System.out.println(nome.concat(" da Silva Pinto"));
		System.out.println("Marcos ".concat(nome));
		System.out.println("Silvio ".concat("Jadson"));
		System.out.println("Silvio Afredo".contains("Afredo"));
		System.out.println("Silvio Afredo".split(" ")[0]);
		
	}
	
}
