package Exerc�cios;
//Fun��o: Coloca tr�s n�meros em ordem crescente
///Autor: Jonathan da Silva
//Data 03/06/2021
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		//Declare
		int num1, num2, num3;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite tr�s n�meros");
		System.out.println("Digite o 1� n�mero");
		num1 = ent.nextInt();
		System.out.println("Digite o 2� n�mero");
		num2 = ent.nextInt();
		System.out.println("Digite o 3� n�mero");
		num3 = ent.nextInt();
		//Condi��o
		if(num3>=num2 && num2>=num1){
		//Ordem crescente
		System.out.println("1�: "+num1+", 2�: "+num2+", 3�: "+num3);
		}
		else if (num3>=num1 && num2>=num3) {
			System.out.println("1�: "+num1+", 2�: "+num3+", 3�: "+num2);
		}
		else if(num1>=num2 && num3>=num1) {
			System.out.println("1�: "+num2+", 2�: "+num1+", 3�: "+num3);
		}
		else if (num3>=num2 && num1>=num3) {
			System.out.println("1�: "+num2+", 2�: "+num3+", 3�: "+num1);
		}
		else if(num2>=num3 && num1>=num2) {
			System.out.println(" 1�: "+num3+", 2�: "+num2+", 3�: "+num1);
		}
		else if(num1>=num3 && num2>=num3) {
		System.out.println("1�: "+num3+", 2�: "+num1+", 3�: "+num2);
		}
		ent.close();
	}

}
