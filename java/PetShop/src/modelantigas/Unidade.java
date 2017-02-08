package modelantigas;

public class Unidade {

	private String nome;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception{
		if(nome == null || nome.equals("")){
			throw new Exception("Informe um nome!"); //com esse throw nao precisa de return.
		}
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
