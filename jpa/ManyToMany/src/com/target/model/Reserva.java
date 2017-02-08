package com.target.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="reserva")
public class Reserva implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToMany
	@JoinTable(name="RESERVA_CLIENTE",	joinColumns={@JoinColumn(name="RESERVA_ID")},inverseJoinColumns={@JoinColumn (name="CLIENTE_ID")})
	private Set<Cliente> clientes = new HashSet <Cliente> ();
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reservaId;
	
	@Column(name="data_reserva")
	private Date dataReserva;
	
	
	public Set<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	public int getReservaId() {
		return reservaId;
	}
	public void setReservaId(int reservaId) {
		this.reservaId = reservaId;
	}
	public Date getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	
	

}
