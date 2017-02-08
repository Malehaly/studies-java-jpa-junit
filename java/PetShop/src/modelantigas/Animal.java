package modelantigas;

public class Animal {
	
	protected String nome;
	private Unidade unidade;
	private Cliente cliente;
	private Produto [] produtos;
	
	//construtor
	public Animal(){
	}
	
	public Animal(String nome){
		this.nome = nome;
		System.out.println("Animal criado: " +nome);
	}
	
	//metodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public void alteraNome (String novoNome){
		this.nome=novoNome;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto [] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto [] produtos) {
		this.produtos = produtos;
	}

}
