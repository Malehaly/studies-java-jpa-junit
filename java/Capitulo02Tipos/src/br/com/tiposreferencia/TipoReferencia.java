package br.com.tiposreferencia;

public class TipoReferencia {

	public  void pub(){
		
		int preco = 100;
		TipoReferencia cal = new TipoReferencia();
		
		cal.calcular(preco); // passando 100 p/ calcular()
		System.out.println(preco); // imprimirá 100 ou 50??

	}

	public void calcular(int p) {
		//p = 50;
		System.out.println(p); // 50
	}

}

