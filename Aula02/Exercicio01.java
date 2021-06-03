package Exercícios;
//Função: informar qual o maior valor inteiro
//Autor: Jonathan da Silva
//Data: 03/06/2021
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		//Declare
		int num1, num2, num3, Mnum = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite três números");
		System.out.print("Primeiro número: ");
		num1 = ler.nextInt();
		System.out.print("Segundo número: ");
		num2 = ler.nextInt();
		System.out.print("Terceiro número: ");
		num3 = ler.nextInt();
		//condição
		if(num1>=num2 && num1>=num3) {
			//Maior Valor
			Mnum = num1;
		}
		else if (num2>=num1 && num2>=num3) {
			//Maior Valor
			Mnum = num2;
		}
		else if (num3>=num1 && num3>=num2) {
			//Maior Valor
			Mnum = num3;
		}
		
		//Exibir maior valor
		System.out.println("O Maior valor digitado é: "+Mnum);
		ler.close();
	}

}
