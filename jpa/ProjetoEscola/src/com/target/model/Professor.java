package com.target.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
	public class Professor {

		@Id
		@GeneratedValue
		private int id;
		
		@Column(name = "nome")
		private String nome;
		
		@Column(name = "materia")
		private String materia;
		
		@Column(name = "ativo")
		private boolean ativo;
		
		@Column(name = "idade")
		private int idade;
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public boolean isAtivo() {
			return ativo;
		}

		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}

		public int getIdade (){
			return idade;
		}
		
		public void setIdade (int idade){
			this.idade = idade;
		}

		public String getMateria() {
			return materia;
		}

		public void setMateria(String materia) {
			this.materia = materia;
		}

}

/*
 * CREATE TABLE professor
(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome varchar(50),
materia varchar(30),
ativo boolean,
idade int
);

 */
	
