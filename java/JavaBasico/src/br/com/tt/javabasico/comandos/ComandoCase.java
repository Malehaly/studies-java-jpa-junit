package br.com.tt.javabasico.comandos;

import java.util.Scanner;

public class ComandoCase {

	public static void main(String[] args) {
			
		boolean continua = true;
		Scanner in = new Scanner(System.in);
		
		while(continua){
			continua = descreveCarro(in);
		}
		in.close();
	}
		
		private static boolean descreveCarro(Scanner in){
			
			String carro;
			do {
				System.out.println("Escreva o nome de um carro:");
				carro = in.nextLine();
			}while(carro.equals(""));
			
			
			switch(carro.toLowerCase()){
			
				case "ferrari":
					System.out.println("Baita carro");
					break;
				case "lamborghini":
					System.out.println("Nice");
					break;
				case "fuca":
					System.out.println("Melhor carro já criado");
					break;
				case "147":
					System.out.println("Sem palavras...");
					break;
				case "sair":
					System.out.println("Até logo...");
					return false;
				default:
					System.out.println("Não conheço esse carro");
				
			}
			return true;
		}
}
