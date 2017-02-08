package br.com.tt.javabasico.comandos;

import java.util.Scanner;

public class ComandoFor {

	public static void main (String[] args){
		loop1();
		loop2();
	}
	
	private static void loop1(){
		for (int count = 0; count <= 10; count++){
			System.out.println(count);
		}
	}
	
	private static void loop2(){
		String [] frutas = new String[]{"Ameixa","Uva","Ma�a"};
		
		for (int contagem = 0; contagem < frutas.length ; contagem++){
			
			System.out.println(frutas[contagem]);
		} //aqui � poss�vel saber em que contagem est�
		
		
		for(String fruta : frutas){
			System.out.println(fruta);
		} //for each - aqui simplesmente se le o conte�do sem contagem.
			
		
		for(String fruta : frutas){
			if(fruta.equals("Uva")){
				continue;
			}
			System.out.println(fruta);
		} //continue - a execu��o do loop para e continua na contagem. nesse caso nao se l� Uva.
		  //break iria parar todo o m�todo, para a contagem nesse caso.
		
		
		
		
		//aqui come�a a gambiarra pra um desafio. ignorar.
		Scanner in = new Scanner(System.in);
		String [] informadas = new String[3];
		
		for(int qtde = 0; qtde < 3; qtde++){
			System.out.println("Informe uma fruta:");
			informadas[qtde] = in.nextLine();
		}
		
		String [] randomicas = new String[3];
		//for(int qtde = 0; qtde < 3; qtde++){
		//	randomicas[qtde] = frutas[Math.round(Math.random())]
		//	System.out.println("Fruta randomica: "+ frutas(posicao));
		//}
		
		forFora : for(String informada : informadas){
			for(String randomica : randomicas){
				if(informada.equals(randomica)){
					System.out.println("Acertou!");
					break forFora;
				}			
			}
		}
				
	}
	
	
}

