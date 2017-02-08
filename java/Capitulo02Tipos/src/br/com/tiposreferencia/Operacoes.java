package br.com.tiposreferencia;

public class Operacoes {
	public static void main(String[] args) {
		/*
		 * Expressões, variáveis e atribuições
		 */
		float sum = (float) (1 + 2 + 3 * 1.2 + (4 + 8) / 3.0);
		System.out.println(sum);
		sum = (float) ((1 + 2 + 3) * 1.2 + (4 + 8) / 3.0);
		System.out.println(sum);
		sum = (float) (sum / Math.sqrt(3.0 * 1.234));
		System.out.println(sum);
		sum = (int) (sum + 33);
		System.out.println(sum);
	}
	
	
	int   a = 0;
	
	char     c = (char) a;
	float    f = (float)a;
	double   d = (double) a;
	short    s = (short) a;
	// boolean  b = (boolean) a; //nao existe a logica de 0 = falso e 1=verdadeiro.
	
	
	

}
