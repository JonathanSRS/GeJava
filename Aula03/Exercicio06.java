package Execicios;
/*Função: Receber números e exibir a média daqueles que forem multiplos de 3
 *Autor: Jonathan da Silva 
 *Data: 04/06/2021
 */
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		//Declare
		double media=0,cont=0 ,soma=0, resto= 0, num=0;
		Scanner ler = new Scanner(System.in);
		//Repetição
		System.out.println("Para sair digite zero");
		do {
			System.out.print("Digite um número: ");
			num = ler.nextInt();
			//Múltiplo de 3
			resto = num%3;
			if(resto==0 && num!= 0) {
				cont++;
				soma+=num;
			}
		}while(num!=0);
		//Média dos números
		media = soma/cont;
		System.out.println("=============================================");
		System.out.printf("Número de multiplos de 3: %1.0f",cont);
		System.out.printf("\nSoma dos números multiplos de 3: %1.0f",soma);
		System.out.println("\nA Média dos números multiplos de 3: "+media);
		System.out.println("=============================================");
		ler.close();
	}

}
