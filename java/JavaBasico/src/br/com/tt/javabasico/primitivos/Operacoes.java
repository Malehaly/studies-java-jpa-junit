package br.com.tt.javabasico.primitivos;

public class Operacoes {
	
	public static void main (String[] args){
		System.out.println(adicao(20,60));
		int resultado = subtracao(34,78);
		System.out.println(resultado);
		
		int numeroTeste = 78;
		boolean ehPar = par(numeroTeste);
		System.out.println(ehPar);
		
		
		int count = 0; //int count = null; 
		count = count+1; //ou: count++; count += 1;
		System.out.println(count);
		//nenhum tipo primitivo pode ser null, somente os tipos de referencia
		
		//pos:
		System.out.println(count++); //dara 1, mas no sistema estara count ==2.
		//pre:
		System.out.println(++count); //dara 3, mesmo que sistema;
		//pre exemplo2:
		int valor1 = count++;
		System.out.println("Count dara: " + count);
		System.out.println("Valor1 dara: " + valor1);
		
		int resultado2 = 30 * subtracao(30,10) - resto (20,3);
		System.out.println(resultado2);
		
		
	}
	
	public static int adicao (int a, int b){
		return a + b;
	}
	
	public static int subtracao (int a, int b){
		return a - b;
	}
	
	public static int resto (int a, int b){
		return a % b;
	}
	
	public static boolean par(int a){
		return resto(a,2) == 0;
	}
	

	
}
