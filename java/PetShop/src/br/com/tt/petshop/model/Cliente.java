package br.com.tt.petshop.model;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import br.com.tt.petshop.exception.CpfException;
import br.com.tt.petshop.exception.ValidacaoException;
import br.com.tt.petshop.tipos.TipoCliente;

public class Cliente {

	private String nome;
	private String cpf;
	private List<Unidade> unidades;
	private Set<Animal> animais;
	private TipoCliente tipo;

	public List<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws ValidacaoException {
		if(nome == null || nome.equals("")){
		// if(nome.equals("") || nome == null){ --> SEMRPE TESTAR CASOS NULL NA FRENTE. se por acaso,
		// conseguissem por nome = null e ele fosse para o teste comparando com uma string ""...
		// assim daria null pointer exception.
			throw new ValidacaoException("Informe um nome para cliente!");
		}
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws ValidacaoException, CpfException{
		if(cpf == null || cpf.equals("")){
			throw new ValidacaoException ("Informe CPF para Cliente.");
		}
		Pattern validacaoCpf = Pattern.compile("^\\d{3,3}.\\d{3,3}.\\d{3,3}-\\d{2,2}$");
		//expressao reguar. assim fica o cpf no parametro: 3.3.3-2 -> numero e traços.
		boolean cpfValido = validacaoCpf.matcher(cpf).matches();
		if(!cpfValido){
			throw new CpfException();
		}
		
		this.cpf = cpf;
	}

	public Set<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(Set<Animal> animais) {
		this.animais = animais;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer()
				.append("Cliente [")
				.append(nome)
				.append(",")
				.append(cpf)
				.append(",")
				.append(tipo.name())
				.append(", \n\t");
		
				if(unidades != null){
					for(Unidade u : unidades){
						buffer.append(u);
					}
				}
			
			return buffer.append("]").toString().toString();			
	}

}
