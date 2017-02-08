package modelantigas;

public class Reptil extends Animal {

	private Boolean peconhento;
	
	
	//construtores
	//o super ira puxar o construtor referente do pai, pois o atributo tbm é do pai.
	public Reptil(){
		super();
		System.out.println("Reptil criado.");
	}	
	public Reptil (String nome){
		super(nome);
		System.out.println("Reptil criado com nome: " +nome);
	}
	
	
	//métodos
	public void setPeconhento(Boolean peconhento) {
		this.peconhento = peconhento;
	}

	public boolean isPeconhento(){
		return peconhento;
	}
	
	public void alteraNomeEPeconhento(String novoNome, Boolean peconhento){
		this.alteraNome(novoNome);
		this.peconhento = peconhento;
	}
	
	//se cria um override aqui pq nao poderia por o mesmo método com as mesmas configurações na classe
	//pai, assim repassa como override pro filho e no bloco põe especificações.
	@Override
	public void alteraNome(String novoNome){
		if(novoNome.equals("Rex")){
			System.out.println("Não use REX! Muitos estão usando.");
			return;
		}
		super.alteraNome(novoNome);
		//aqui se usasse this.alteraNome, daria um loop infinito, pois puxaria sempre o método dessa 
		//classe. Assim, existe o SUPER, que puxa o atributo/método do pai.
	}
	
}
