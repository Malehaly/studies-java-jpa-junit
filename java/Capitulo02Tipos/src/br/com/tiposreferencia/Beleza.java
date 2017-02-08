package br.com.tiposreferencia;

public class Beleza {
	private String nome;
	private Boolean feio;
	private String euSou;

	public Beleza() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nome
	 * @param feio
	 */
	public Beleza(String nome, Boolean feio) {
		this.nome = nome;
		this.feio = feio;

	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the feio
	 */
	public String getEuSou() {

		return euSou;
	}

	/**
	 * @param feio
	 *            the feio to set
	 */
	public void setFeio(Boolean feio) {

		if (feio == false) {
			this.euSou = "Bonito";
		} else {
			this.euSou = "Feio";
		}

	}
}
