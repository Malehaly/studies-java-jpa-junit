package br.com.tiposreferencia;

public class EuSou {

	public static void main(String[] args) {
		Beleza cassio = new Beleza();
		cassio.setNome("Cássio Trindade");
		cassio.setFeio(false);

		System.out.println(cassio.getNome() + " é " + cassio.getEuSou());
	}

}
