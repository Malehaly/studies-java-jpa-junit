package br.com.tiposreferencia;

public class Impressao {
	public void imprime() {
		System.out.println("Bem Vindo ao Java!");
	}

	public void imprime(int n) {
		int i = 0;
		while (i < n) {
			System.out.println("Bem Vindo ao Java!");
			i++;
		}
	}
	
	public void imprime(int n, String s) {
		int i = 0;
		while (i < n) {
			System.out.println(s);
			i++;
		}
	}

	public void imprime(int n, String s, String t) {
		int i = 0;
		while (i < n) {
			System.out.println(s);
			i++;
		}
		System.out.println(t);
	}

}
