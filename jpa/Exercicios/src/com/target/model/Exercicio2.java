package com.target.model;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "JavaBean é a classe que armazena dados, "
				+ "que será extraída para banco de dados. "
				+ "POJOs são padrões de projeto que padronizam o formato da classe, "
				+ "seus atributos e métodos. São classes simples.");
		
		JOptionPane.showMessageDialog(null, "Precisará incluir a classe a que está "
				+ "POJOada junto ao xml com sua package.");

		JOptionPane.showMessageDialog(null,"Oracle TopLink (orientado a objetos, free), "
				+ "Apache OpenJPA(OS), Redhat/jboss Hibernate(OpenSource), EclipseLink JPA");

		JOptionPane.showMessageDialog(null, "Facilita em tempo a persistência e manutenção de "
				+ "dados ao SGBDR- gera uma "
				+ "fábrica que manuseia as entidades e abre as conexões/sessões com o BD");

		JOptionPane.showMessageDialog(null, "get/set, nao final, public, deve possuir "
				+ "as características do framework que forem usados.");
		
		JOptionPane.showMessageDialog(null, "pois devem ser levados dados ao BD que possam "
				+ "ser alterados. assim, atributos e "
				+ "classes final não fazem sentido existir em tabelas, pois são constantes.");

		JOptionPane.showMessageDialog(null, "pojo transiente - quando criados. "
				+ "persistente - quando estão em sessão. "
				+ "separado - quando possui suas informações no BD e não está mais em sessão.");
	}

}
