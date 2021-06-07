package Exercícios;
/*Função: Adiciona valores ao vetor e soma 
 *Autor: Jonathan da Silva
 *Data: 07/06/2021
 */
public class teste {

	public static void main(String[] args) {
		//Declare
		int soma = 0,vetorC[] = {1,0,5,-2,-5,7};
		//soma do vetor por posição 0,1,5
		soma = vetorC[0] + vetorC[1] + vetorC[5];
		//atribuir o valor 100 na posição 4
		vetorC[4] = 100;
		//exibir valores do vetor e a soma
		System.out.print("Posição 1º "+vetorC[0]+"\nPosição 2º "+vetorC[1]
				+"\nPosição 3º "+vetorC[2]+"\nPosição 4º "+vetorC[3]+"\nPosição 5º "
				+vetorC[4]+"\nPosição 6º "+vetorC[5]+"\nSoma: "+soma);
	}

}
