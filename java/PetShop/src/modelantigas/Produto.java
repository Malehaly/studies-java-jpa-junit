package modelantigas;

public class Produto {

	private final float TAXA_APLICACAO = 12.0f; //FINAL - define uma vari�vel para ser CONSTANTE
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
	// outro exemplo de FINAL: aqui, a variavel indicada que ser� o valor da Descri��o, ent�o nenhuma
	// descri��o poder� alterar uma descri��o j� existente.
	// se utilizar o FINAL no come�o do m�todo, o m�todo s� ser� usado uma vez.
	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}
	
}
