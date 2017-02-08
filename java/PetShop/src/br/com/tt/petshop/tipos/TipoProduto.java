package br.com.tt.petshop.tipos;

public enum TipoProduto {
	
	MEDICAMENTO(10f),
	ALIMENTO(17f),
	ESTETICO(30f),
	BRINQUEDO(70f);

	private float alicota;
	
	TipoProduto(float alicota){
		this.alicota = alicota;
	}
	
	public float getAlicota() {
		return alicota;
	}
}
