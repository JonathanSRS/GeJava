package Execicios;
/* Fun��o: Mostra quantidade n�meros impares e pares
 * Autor: Jonathan da Silva
 * Data 04/06/2021
 */
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		//Declare
		int num, par=0, impar=0, resto;
		Scanner ler = new Scanner(System.in);
		//Repeti��o
		for(int i = 1;i>=1 && i<=10;i++) {
			System.out.println("Digite um n�mero "+i+"�");
			num = ler.nextInt();
			resto = num%2;
		//Quantos s�o impar
			if(resto!=0) {
				impar++;
			}
		//Quantos s�o par
			if(resto==0) {
				par++;
			}

		}
		//Mostrar pares
		System.out.println("Quantidade de n�meros pares: "+par);
		//Mostrar impares
		System.out.println("Quantidade de n�meros �mpares: "+impar);
		ler.close();

	}

}
