package Exerc�cios;

import java.util.Scanner;

/*Fun��o: receber 6 valores inteiros e somar os pares e contabilizar os impares
 *Autor: Jonathan da Silva
 *Data: 07/06/2021
 */
public class Exercicio02 {

	public static void main(String[] args) {
		// Declare
		int par=0, impar = 0, resto;
		int[] num = new int[6];
		Scanner ler = new Scanner(System.in);
		//repeti��o
		System.out.println("Insira os 6 n�meros");
		for(int i = 0;i<=5;i++) {
			//Entrada
			System.out.print("Digite o "+(i+1)+"� n�mero: ");
			num[i] = ler.nextInt();
			// Impar ou par
			resto = num[i]%2;
			//condi��o
			if(resto==0) {
			//soma dos n�meros pares
				par+=num[i];
			}else {
			//Quantidade de n�meros �mpares
			impar++;
			}
		}
		System.out.println("Soma dos pares: "+par+"\nQuantidade n�meros impares: "+impar);
		for(int i=0; i<=5;i++) {
			resto = num[i]%2;
			if(resto ==0) {
				System.out.printf("%d ",num[i]);
				System.out.print("� par ");
			}
		}
		System.out.println("");
		for(int i=0; i<=5;i++) {
			resto = num[i]%2;
			if (resto!=0){
				System.out.printf("%d ",num[i]);
				System.out.print("� impar ");
			}
		}
		ler.close();
	}

}
