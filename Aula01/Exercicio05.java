package br.com.generation.aula01;
/*Função: Calcula a media ponderada de 3 notas
 * Autor: Jonathan da Silva
 * Data: 02/06/2021
 */
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media, P1, P2, P3;
		Scanner dado = new Scanner(System.in);
		System.out.println("Insira todas as notas seus respectivos pesos, por favor.");
		System.out.println("Digite a Primeira Nota");
		nota1 = dado.nextDouble();
		System.out.print("Peso:");
		P1=dado.nextDouble();
		System.out.println("Digite a segundo Nota");
		nota2 = dado.nextDouble();
		System.out.print("Peso:");
		P2=dado.nextDouble();
		System.out.println("Digite a terceira Nota");
		nota3 = dado.nextDouble();
		System.out.print("Peso:");
		P3=dado.nextDouble();
		media = ((nota1*P1)+(nota2*P2)+(nota3*P3))/(P1+P2+P3);
		System.out.println("Resultado média: "+media);
		dado.close();

	}

}
