package OriencaoaoObjetoExercicios;
public class ProdutoEletro {
	int Pc;
	int Processador;
	int Ram;
	int HD;
	int Fonte;
	int PlacaMae;
	int soma;
	
	void preco() {
		System.out.println("Valor do Pc");
		soma = Pc + Processador + Ram + HD + Fonte + PlacaMae;
		System.out.println(soma);
	}
	
}
