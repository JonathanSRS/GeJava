package Exerc�cios;
//Fun��o: Verifica se um n�mero � par ou �mpar e mostra a raiz ou a pot�ncia do n�mero
//Autor: Jonathan da Silva
//Data 03/06/2021
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Declare
		int num, resto;
		System.out.println("Digite um n�mero");
		num = ler.nextInt();
		resto = num%2;
		//Condi��o
		if(resto==0) {
		//Par
			System.out.println("O n�mero " +num+ " � par e A raiz �: "+Math.sqrt(num));
		}
		else {
		//Impar
			System.out.println("O n�mero "+num+" � impar e Elevado ao quadrado �: " +Math.pow(num, 2));
		}
		ler.close();
	}

}
