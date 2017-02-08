package br.com.tiposprimitivos;

public class TiposPrimitivos {
	/*
	 * Tipagem de tipos primitivos com suas declarações
	 */
	int codigoPedigree = 12232;
	float pesoAnimal = 50.5f;
	double precoAnimal = 1800.50d;
	short alturaAnimal = 95;
	long comprimentoAnimal = 120;
	byte idadeAnibal = 127;
	boolean temDono = true;
	char letraInicialAnimal = 'D';

	private static void teste() {
		/*
		 * Monta a partir de tipos primitivos char
		 */
		char tab = '\t', apostrofo = '\'', nulo = ' ';
		char unicode = '\u0060';
		StringBuilder s = new StringBuilder();

		s.append(tab);
		s.append(apostrofo);
		s.append(nulo);
		s.append(unicode);
		s.append(apostrofo);

		System.out.println(s);
		System.out.println("cassiowt" + '\u0040' + "gmail" + '\u002E' + "com");

		char a = 'A', espaco = ' ';

		System.out.println(Character.isLowerCase(a));
		System.out.println(a + espaco); // soma
		System.out.println(tab + "" + apostrofo + "Casa" + apostrofo);

		/*
		 * Imprime tipos primitivos inteiros com expressão em bases diferentes
		 */
		int numeroHexa = 0xff; // decimal 255 expresso em base hexadecimal
		int numeroOcta = 0377; // decimal 255 expresso em base octal

		System.out.println("Hexa: " + numeroHexa);
		System.out.println("Octa: " + numeroOcta);

		/*
		 * Exemplo de de tipo primitivo longo
		 */
		int numeroInteiro = 1234; // um valor int
		long numeroLong = 1234L; // um valor long
		long numeroLong2 = 0xffL; // outro valor long, em base hexadecimal

		System.out.println("Inteiro: " + numeroInteiro);
		System.out.println("Long: " + numeroLong);
		System.out.println("Long2: " + numeroLong2);

		/*
		 * Exempo de uo to tipo ptimitivo booleano
		 */
		boolean brasilCampeao = true;

		if (brasilCampeao) {
			System.out.println("PentaCampeão do Mundo");
		} else
			System.out.println("mentira");
		

		/*
		 * Exemplo de resultado de erro java.lang.ArithmeticException:
		 */
		int numero = 32000;
		int resultadoErro;
		
		//System.out.println(resultadoErro = numero /0);
		
		/*
		 * Exemplos de tipos primitivos float e double
		 */
		float  numeroFloat	 = 123.45f ;	// float
		double numeroDouble  = 0.0 ;    	// double
		
		double numeroDouble2 = .02;     	// double
		double numeroDouble3 = 1.2345E02; 	// 1.2345 x 102 ou 123.45
		double numeroDouble4 = 1e-6 ;     	// 1 x 10-6 ou 0.000001
	  
		double numeroDouble1 = 6.02e23; 	// No. de Avogrado 6.02 x 1023
		Float  numeroFloat1  = 6.02e23f; 	// No. de Avogrado 6.02 x 1023

		System.out.println(numeroDouble1);
		System.out.println(numeroFloat1.doubleValue());

		/* 
		 * Exemplo simples Strings  
		 */
		String s0 = "Joao";
		String s1 = "Maria";
		char c = '&';

		System.out.println(s0 + c + s1);
		System.out.println(s0 + " \u0026 " + s1);
	}

	public static void main(String[] args) {
		//teste();
	}
}
