package Exercícios;
//Função: Coloca três números em ordem crescente
///Autor: Jonathan da Silva
//Data 03/06/2021
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		//Declare
		int num1, num2, num3;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite três números");
		System.out.println("Digite o 1ª número");
		num1 = ent.nextInt();
		System.out.println("Digite o 2ª número");
		num2 = ent.nextInt();
		System.out.println("Digite o 3ª número");
		num3 = ent.nextInt();
		//Condição
		if(num3>=num2 && num2>=num1){
		//Ordem crescente
		System.out.println("1ª: "+num1+", 2ª: "+num2+", 3ª: "+num3);
		}
		else if (num3>=num1 && num2>=num3) {
			System.out.println("1ª: "+num1+", 2ª: "+num3+", 3ª: "+num2);
		}
		else if(num1>=num2 && num3>=num1) {
			System.out.println("1ª: "+num2+", 2ª: "+num1+", 3ª: "+num3);
		}
		else if (num3>=num2 && num1>=num3) {
			System.out.println("1ª: "+num2+", 2ª: "+num3+", 3ª: "+num1);
		}
		else if(num2>=num3 && num1>=num2) {
			System.out.println(" 1ª: "+num3+", 2ª: "+num2+", 3ª: "+num1);
		}
		else if(num1>=num3 && num2>=num3) {
		System.out.println("1ª: "+num3+", 2ª: "+num1+", 3ª: "+num2);
		}
		ent.close();
	}

}
