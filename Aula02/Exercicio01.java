package Exerc�cios;
//Fun��o: informar qual o maior valor inteiro
//Autor: Jonathan da Silva
//Data: 03/06/2021
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		//Declare
		int num1, num2, num3, Mnum = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite tr�s n�meros");
		System.out.print("Primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.print("Segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.print("Terceiro n�mero: ");
		num3 = ler.nextInt();
		//condi��o
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
		System.out.println("O Maior valor digitado �: "+Mnum);
		ler.close();
	}

}
