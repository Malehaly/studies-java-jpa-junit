package br.com.tt.desafios.nomes;

import java.io.File;
import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) throws Exception{
		
		Scanner in = new Scanner(new File("C:\\Java Fundamentos\\workspace\\Desafios\\resources\\MOCK_DATA.txt"));
		int a = 0, b = 0, c=0;
		while(in.hasNextLine()){
			// System.out.println(in.nextLine());
			String linha = in.nextLine();
			String primeiraLetra = linha.substring(0,1);
			char primeiraLetraChar = primeiraLetra.charAt(0);
			
			switch(primeiraLetraChar){
				case 'A': a++;break;
				case 'B': b++;break;
				case 'C': c++;break;
			
			}
						
			//contar para cada letra do alfabeto quantos nomes iniciam com essa letra
			//a= 4 pessoas
			//b=5.. etc
		}
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		System.out.println("C: "+c);
		
		in.close();
	}
}
