package com.target.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


	
	@Entity
	@Table(name="clientes")
	public class Cliente {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		
		@OneToMany(cascade={CascadeType.ALL})
		@JoinColumn(name="clente_id")
		private Collection<Telefone> telefone=new ArrayList<Telefone>();

		@Column(name="nome")
		private String nome;
		@Column(name="sobreNome")
		private String sobreNome;
		@Column(name="rua")
		private String rua;
		@Column(name="cidade")
		private String cidade;
		@Column(name="cep")
		private String cep;
		@Column(name="dataNacimento")
		@Temporal(TemporalType.DATE)
		private Calendar dataNacimento;
		
		
		
		
		public Cliente() {
			
		}
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
		public String getSobreNome() {
			return sobreNome;
		}
		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
		}
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) {
			this.rua = rua;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public Calendar getDataNacimento() {
			return dataNacimento;
		}
		public void setDataNacimento(Calendar dataNacimento) {
			this.dataNacimento = dataNacimento;
		}
		
		

}
