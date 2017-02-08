package com.targettrust.model;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Consulta> consultas;
	
	
	public void incluiAgenda (Consulta c){
		
		if(consultas.size() >= 5){
			
		System.out.println("Consultas atingiram um limite de 5 datas.");
		return;	
		}
		this.consultas.add(c);
		
	}
	
}

	
	/*
	Passo 2: Crie uma classe p�blica chamada Agenda no pacote com.targettrust.model e defina o seguinte atributo:

		private ArrayList<Consulta> consultas;

		Crie os geters e setrs e o construtor default e um construtor que receba como par�metros todos os atributos da classe.

		Observe no atributo acima o uso de generics para definir o tipo de objetos da cole��o:

		Passo 3: Crie no m�todo construtor o ArrayList.

		consultas = new ArrayList<>();

		  

		Passo 4: Defina nesta classe uma opera��o que possa receber objetos da classe Consulta e os adiciona a cole��o de Agenda. Quando esta cole��o atingir um n�mero de 5 Consultas deve ser impresso um aviso.

		public void incluiAgenda(Consulta c) {

		 

		**----------Consultas atingiram o limite de 5 datas
		*/


