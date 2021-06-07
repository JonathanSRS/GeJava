package Exercícios;
/*Função: adiciona valores a duas matrizes e realiza à ação de acordo com o Menu de opções
 *Autor: Jonathan da Silva
 *Data: 07/06/2021 
 */
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		//Declare
		int l,c,menu,constante;
		int matrizA[][] = new int[2][2];
		int matrizB[][] = new int[2][2];
		int matrizR[][] = new int[2][2];
		Scanner ler = new Scanner(System.in);
		//Entrada
		System.out.println("Insira os números das  matrizes");
		System.out.println("=============================================================");
		System.out.println("Matriz A");
		for(l = 0;l<matrizA.length;l++) {
			for(c = 0;c<matrizA[l].length;c++){
				System.out.println("Matriz A Digite o número para (linha, coluna): ("+l+","+c+")");
				matrizA[l][c] = ler.nextInt();
			}
		}
		System.out.println("=============================================================");
		System.out.println("Matriz B");
		for(l = 0;l<matrizB.length;l++) {
			for(c = 0;c<matrizB[l].length;c++){
				System.out.println("Matriz B Digite o número para (linha, coluna): ("+l+","+c+")");
				matrizB[l][c] = ler.nextInt();
			}
		}
		System.out.println("=============================================================");
		//Menu
		do {
			System.out.println("Escolha uma das Opções abaixo"+
					"\n1: Somar as duas matrizes"+
					"\n2: Subtrair a primeira matriz da segunda"+
					"\n3: Adicionar uma constante nas duas matrizes"+
					"\n4: Exibir as matrizes"+
					"\n5: Sair");
			System.out.print("Opção: ");
			menu = ler.nextInt();
			System.out.println();
			//Opções
			switch(menu) {
				case 1:
					for(l = 0;l<matrizR.length;l++) {
						for(c = 0;c<matrizR[l].length;c++){
							matrizR[l][c]=matrizA[l][c]+matrizB[l][c];
						}
					}
					System.out.println("================");
					for(l = 0;l<matrizR.length;l++){
						for(c=0;c<matrizR[l].length;c++) {
							System.out.printf("[%d]",matrizR[l][c]);
						}
						System.out.println();
					}
					System.out.println("================");
					break;
				case 2:
					for(l = 0;l<matrizR.length;l++) {
						for(c = 0;c<matrizR[l].length;c++){
							matrizR[l][c]=matrizA[l][c] - matrizB[l][c];
						}
					}
					System.out.println("================");
					for(l = 0;l<matrizR.length;l++){
						for(c=0;c<matrizR[l].length;c++) {
							System.out.printf("[%d]",matrizR[l][c]);
						}
						System.out.println();
					}
					System.out.println("================");
					break;
				case 3:
					System.out.print("Digite um valor para constante: ");
					constante = ler.nextInt();
					System.out.println("Matriz A");
					System.out.println("================");
					for(l = 0;l<matrizA.length;l++) {
						for(c = 0;c<matrizA[l].length;c++){
							matrizA[l][c] +=constante;
							System.out.printf("[%d]",matrizA[l][c]);
						}
						System.out.println();
					}
					System.out.println("Matriz B");
					System.out.println("================");
					for(l = 0;l<matrizB.length;l++){
						for(c=0;c<matrizB[l].length;c++) {
							matrizB[l][c] +=constante;
							System.out.printf("[%d]",matrizB[l][c]);
						}
						System.out.println();
					}
					System.out.println("================");
					break;
				case 4:
					System.out.println("================");
					for(l = 0;l<matrizA.length;l++) {
						for(c = 0;c<matrizA[l].length;c++){
							System.out.printf("[%d]",matrizA[l][c]);
						}
						System.out.println();
					}
					System.out.println("================");
					for(l = 0;l<matrizB.length;l++){
						for(c=0;c<matrizB[l].length;c++) {
							System.out.printf("[%d]",matrizB[l][c]);
						}
						System.out.println();
					}
					System.out.println("================");
					break;
				case 5:
					break;
				default:
					System.out.println("Opção invalida");
					break;
						
			}
		}while(menu != 5);
	}

}
