package aplicacao;

public class Produto {

	private int quantVendida;
	private double preco;
	private boolean vendavel;
	private float peso;
	
	public int getQuantVendida() {
		return quantVendida;
	}
	public void setQuantVendida(int quantVendida) {
		this.quantVendida = quantVendida;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public boolean isVendavel() {
		return vendavel;
	}
	public void setVendavel(boolean vendavel) {
		this.vendavel = vendavel;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
}
