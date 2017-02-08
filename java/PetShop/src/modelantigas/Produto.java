package modelantigas;

public class Produto {

	private final float TAXA_APLICACAO = 12.0f; //FINAL - define uma variável para ser CONSTANTE
												//final + static = fica visivel a tudo, sem nunca mudar

	private Float valor;
	private String descricao;

	public float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	// outro exemplo de FINAL: aqui, a variavel indicada que será o valor da Descrição, então nenhuma
	// descrição poderá alterar uma descrição já existente.
	// se utilizar o FINAL no começo do método, o método só será usado uma vez.
	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}
	
}
