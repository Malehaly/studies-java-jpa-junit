package br.com.tt.javabasico.comandos;

public class Comando {
	
	private static int nro3;
	
	public static void main(String[] args) {
		
		int nro1 = 1;
		if(nro1 == 1){
			System.out.println("1==1");
		}
		
		int nro2 = 1;
		if (nro2 == nro1){
			System.out.println("nro2 == nro1");
		}
		
		nro3 = 346;
		if(nro1 > nro3){
			System.out.println("nro1>nro3");
		}else{
			System.out.println("nro1 n�o � > nro3");
		}
		
		// !!! n�o fazer: !!!
		if(nro1 > nro2)
			System.out.println("nro>nro2");
		System.out.println("nro1>nro2 real");
		// tanto if e else, sem bloco, ir� ler somente a primeira linha ap�s o if. exemplo acima ir�
		// ler o segundo println, pois o primeiro nao passou no if, assim ja acaba o if.
		
		if (nro1>nro2 || nro3 > nro1){
			System.out.println("nro1>nro2 || nro3 > nro1");
		}

		if (nro1>nro2 && nro3 > nro1){ //nao ira aparecer: &&=and
			System.out.println("nro1>nro2 || nro3 > nro1");
		}
		

		if (validacao1()){				//ira dar false e n�o ler o print. pois esta testando se validacao � true
			System.out.println("true");
		}
		if (validacao1() == true){		//ta testando se � true, o que n�o �
			System.out.println("true");
		}
		if (validacao1() == false){		// ira dar true, pois false == false � true; assim l� o print
			System.out.println("true");
		}
		if (!validacao1()){				// ira dar true, pois !(false) � true; assim l� o print
			System.out.println("true");
		}
		
		System.out.println("validacao1() || validacao1() && validacao1()");
		if (validacao1() || validacao1() && validacao1()){
			System.out.println("true");
		}								//nesse caso ira ler 2 vezes o m�todo validacao1
										//pois ap�s o && j� nao ira precisar passar adiante, pois o
										//segundo teste j� mata a o if como false.
										//Por isso, se utiliza nos testes um teste pequeno no come�o,
										//s� para ap�s utilizar um teste grande ap�s.
										//Regra: OU � for�a de multiplica��o, � lido primeiro que &&.
		
		if (nro1 >nro2){
			System.out.println("if");
		}else if(nro1 == nro2){
			System.out.println("else if");
		}else{
			System.out.println("else");
		}
		
		//operador tern�rio ? :
		int nro5 = (nro3 > 5) ? nro3 : nro2;
		//assim, testa o caso, se for true utiliza nro3, se nao usa o valor do nro2
		//util para nao dar valores indesejaveis por exemplo.
	}
	
	public static boolean validacao1(){
		System.out.println("entrou na valida��o1()");
		float nro4 = 45.2f;
		return nro4 == nro3;
	}
	
	//outro exemplo tern�rio, para nunca retornar null pra uma busca num banco
	private String buscaNome(){
		String nomeVindoDoBanco = null;
		return nomeVindoDoBanco == null ? new String() : nomeVindoDoBanco;
	}
	
	
}
