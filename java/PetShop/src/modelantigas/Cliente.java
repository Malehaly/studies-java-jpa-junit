package modelantigas;

public class Cliente {

	private String nome;
	private String cpf;
	private Unidade[] unidades;
	private Animal[] animais;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Unidade[] getUnidades() {
		return unidades;
	}
	public void setUnidades(Unidade[] unidades) {
		this.unidades = unidades;
	}
	public Animal[] getAnimais() {
		return animais;
	}
	public void setAnimais(Animal[] animais) {
		this.animais = animais;
	}

}
