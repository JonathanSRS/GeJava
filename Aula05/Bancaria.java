package OriencaoaoObjetoExercicios;

public class Bancaria {
	String Nome;
	String CPF;
	static String NumeroConta;
	int Renda = 0;
	
	void AbrirConta() {
		if(Renda >= 1000) {
			System.out.println("Aprovado");
			System.out.println("Nome: |"+Nome+"|   CPF: |"+CPF+"\n|"+"N�"+NumeroConta+"|");
		}else {
			System.out.println("tente de novo ap�s 90 dias");
		}
	}

}
