package Exercícios;
//Função: Definir categoria através da idade
//Autor: Jonathan da Silva
//Data 03/06/2021
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		//Declare
		int idade;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite sua idade");
		idade = ent.nextInt();
		
		//Escolha
		switch(idade) {
		case 10,11,13,14:
			System.out.println("Categoria: Infantil");
		break;
		case 15,16,17:
			System.out.println("Categoria: Juvenil");
		break;
		case 18,19,20,21,22,23,24,25:
			System.out.println("Categoria: Adulto");
		break;
		default:
			System.out.println("Valor invalido");
		break;
		}
		ent.close();
	}

}
