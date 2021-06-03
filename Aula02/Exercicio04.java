package Exercícios;
//Função: Verifica se um número é par ou ímpar e mostra a raiz ou a potência do número
//Autor: Jonathan da Silva
//Data 03/06/2021
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Declare
		int num, resto;
		System.out.println("Digite um número");
		num = ler.nextInt();
		resto = num%2;
		//Condição
		if(resto==0) {
		//Par
			System.out.println("O número " +num+ " é par e A raiz é: "+Math.sqrt(num));
		}
		else {
		//Impar
			System.out.println("O número "+num+" é impar e Elevado ao quadrado é: " +Math.pow(num, 2));
		}
		ler.close();
	}

}
