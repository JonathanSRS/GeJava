package Exercícios;

import java.util.Scanner;

/*Função: receber 6 valores inteiros e somar os pares e contabilizar os impares
 *Autor: Jonathan da Silva
 *Data: 07/06/2021
 */
public class Exercicio02 {

	public static void main(String[] args) {
		// Declare
		int par=0, impar = 0, resto;
		int[] num = new int[6];
		Scanner ler = new Scanner(System.in);
		//repetição
		System.out.println("Insira os 6 números");
		for(int i = 0;i<=5;i++) {
			//Entrada
			System.out.print("Digite o "+(i+1)+"º número: ");
			num[i] = ler.nextInt();
			// Impar ou par
			resto = num[i]%2;
			//condição
			if(resto==0) {
			//soma dos números pares
				par+=num[i];
			}else {
			//Quantidade de números ímpares
			impar++;
			}
		}
		System.out.println("Soma dos pares: "+par+"\nQuantidade números impares: "+impar);
		for(int i=0; i<=5;i++) {
			resto = num[i]%2;
			if(resto ==0) {
				System.out.printf("%d ",num[i]);
				System.out.print("é par ");
			}
		}
		System.out.println("");
		for(int i=0; i<=5;i++) {
			resto = num[i]%2;
			if (resto!=0){
				System.out.printf("%d ",num[i]);
				System.out.print("é impar ");
			}
		}
		ler.close();
	}

}
