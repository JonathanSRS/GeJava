package Exerc�cios;
/*Fun��o: Adiciona valores ao vetor e soma 
 *Autor: Jonathan da Silva
 *Data: 07/06/2021
 */
public class teste {

	public static void main(String[] args) {
		//Declare
		int soma = 0,vetorC[] = {1,0,5,-2,-5,7};
		//soma do vetor por posi��o 0,1,5
		soma = vetorC[0] + vetorC[1] + vetorC[5];
		//atribuir o valor 100 na posi��o 4
		vetorC[4] = 100;
		//exibir valores do vetor e a soma
		System.out.print("Posi��o 1� "+vetorC[0]+"\nPosi��o 2� "+vetorC[1]
				+"\nPosi��o 3� "+vetorC[2]+"\nPosi��o 4� "+vetorC[3]+"\nPosi��o 5� "
				+vetorC[4]+"\nPosi��o 6� "+vetorC[5]+"\nSoma: "+soma);
	}

}
