package br.com.tt.petshop.model;

import br.com.tt.petshop.tipos.TipoProduto;

public class Produto {
	
	public final float PREFIXO = 12.0f;

	private int id;
	private Float valor;
	private String descricao;
	private TipoProduto tipo;
	
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return new StringBuffer()
				.append("Produto [")
				.append(descricao)
				.append(",")
				.append(valor)
				.append(",")
				.append(tipo.name())
				.append(",")
				.append(tipo.getAlicota())
				.append("]")
				.toString();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
}
