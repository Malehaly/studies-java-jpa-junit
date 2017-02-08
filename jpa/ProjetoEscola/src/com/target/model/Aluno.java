package com.target.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "aluno")
	public class Aluno {

		@Id
		@GeneratedValue
		private int id;
		
		@Column(name = "nome")
		private String nome;
		
		@Column(name = "ativo")
		private boolean ativo;
		
		@Column(name = "data_nascimento")
		@Temporal(TemporalType.DATE)
		private Calendar dataNascimento;
		

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

		public Calendar getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(Calendar dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

}
	

