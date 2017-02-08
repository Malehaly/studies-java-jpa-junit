package br.com.comversorestipos;

public class Conversores {
	
	public static void main(String[] args) {
	
		float quantidade = 100.87f;
		
		double valor = 23.67d;
		
		double resultado = quantidade*valor;
		float resultado2 = (float)(quantidade*valor);
		System.out.println(resultado);
		System.out.println(resultado2);
		
		resultado2 = new Float(quantidade*valor); //é igual a funcao aciam do resultado2
		System.out.println(resultado2); 
		
		int resultadoInteiro = new Double (quantidade*valor).intValue();
		System.out.println(resultadoInteiro); 
		resultado2 = Float.parseFloat (String.valueOf(quantidade*valor));
		System.out.println(resultado2); 
		resultado2 = Float.parseFloat ("80") * quantidade;
		System.out.println(resultado2); 
		
	}
	
}
