package com.target.model;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "JavaBean � a classe que armazena dados, "
				+ "que ser� extra�da para banco de dados. "
				+ "POJOs s�o padr�es de projeto que padronizam o formato da classe, "
				+ "seus atributos e m�todos. S�o classes simples.");
		
		JOptionPane.showMessageDialog(null, "Precisar� incluir a classe a que est� "
				+ "POJOada junto ao xml com sua package.");

		JOptionPane.showMessageDialog(null,"Oracle TopLink (orientado a objetos, free), "
				+ "Apache OpenJPA(OS), Redhat/jboss Hibernate(OpenSource), EclipseLink JPA");

		JOptionPane.showMessageDialog(null, "Facilita em tempo a persist�ncia e manuten��o de "
				+ "dados ao SGBDR- gera uma "
				+ "f�brica que manuseia as entidades e abre as conex�es/sess�es com o BD");

		JOptionPane.showMessageDialog(null, "get/set, nao final, public, deve possuir "
				+ "as caracter�sticas do framework que forem usados.");
		
		JOptionPane.showMessageDialog(null, "pois devem ser levados dados ao BD que possam "
				+ "ser alterados. assim, atributos e "
				+ "classes final n�o fazem sentido existir em tabelas, pois s�o constantes.");

		JOptionPane.showMessageDialog(null, "pojo transiente - quando criados. "
				+ "persistente - quando est�o em sess�o. "
				+ "separado - quando possui suas informa��es no BD e n�o est� mais em sess�o.");
	}

}
