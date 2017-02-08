package br.com.tiposreferencia;

public class Aluno {
	private int idade;
	private Beleza beleza;

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @return the beleza
	 */
	public Beleza getBeleza() {
		return beleza;
	}

	/**
	 * @param idade
	 *            the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @param beleza
	 *            the beleza to set
	 */
	public void setBeleza(Beleza beleza) {
		this.beleza = beleza;
	}

	
	public static void main(String[] args) {
		
		Beleza b = new Beleza("Cassio", false);
		Aluno a = new Aluno();
		
		a.setBeleza(b);
		a.setIdade(40);
		
		System.out.println(a.getBeleza().getEuSou() + a.getIdade());
	}
}
