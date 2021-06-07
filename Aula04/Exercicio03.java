package Exercícios;

import java.util.Scanner;

/*Função: Adicionar valores em matriz 3x3 e informa a quantidade maior que 10.
 *Autor: Jonathan da Silva
 *Data: 07/06/2021 
 */
public class Exercicio03 {

	public static void main(String[] args) {
		// Declare
		int cont = 0;
		int[][] matriz = new int[3][3];
		Scanner ler = new Scanner(System.in);
		
		//contar quantidade num>10
		for(int l = 0; l<matriz.length;l++) {
			for(int c = 0; c<matriz[l].length;c++) {
				System.out.println("Digite um número para (linha, coluna): ("+l+","+c+")");
				matriz[l][c] = ler.nextInt();
				if(matriz[l][c]>10) {
					cont++;
				}
			}
		}
		System.out.println("Matriz");
		System.out.println("==================");
		for(int l = 0; l<matriz.length;l++) {
			for(int c = 0; c<matriz[l].length;c++) {
				System.out.printf("[%d] ",matriz[l][c]);
			}
			System.out.println();
		}
		System.out.println("==================");
		System.out.println("Quantidade de números maiores que 10: "+cont);
		ler.close();
	}

}
