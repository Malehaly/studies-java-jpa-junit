package com.target.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Cliente2 extends Pessoa2 implements Serializable {
	private static final long serialVersionUID = 1L;

	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//private long id;
	
	@Column(name="cnpj")
	private String cnpj;

}
