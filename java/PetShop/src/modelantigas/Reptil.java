package modelantigas;

public class Reptil extends Animal {

	private Boolean peconhento;
	
	
	//construtores
	//o super ira puxar o construtor referente do pai, pois o atributo tbm � do pai.
	public Reptil(){
		super();
		System.out.println("Reptil criado.");
	}	
	public Reptil (String nome){
		super(nome);
		System.out.println("Reptil criado com nome: " +nome);
	}
	
	
	//m�todos
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
	
	//se cria um override aqui pq nao poderia por o mesmo m�todo com as mesmas configura��es na classe
	//pai, assim repassa como override pro filho e no bloco p�e especifica��es.
	@Override
	public void alteraNome(String novoNome){
		if(novoNome.equals("Rex")){
			System.out.println("N�o use REX! Muitos est�o usando.");
			return;
		}
		super.alteraNome(novoNome);
		//aqui se usasse this.alteraNome, daria um loop infinito, pois puxaria sempre o m�todo dessa 
		//classe. Assim, existe o SUPER, que puxa o atributo/m�todo do pai.
	}
	
}
