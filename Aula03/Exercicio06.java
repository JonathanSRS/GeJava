package Execicios;
/*Fun��o: Receber n�meros e exibir a m�dia daqueles que forem multiplos de 3
 *Autor: Jonathan da Silva 
 *Data: 04/06/2021
 */
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		//Declare
		double media=0,cont=0 ,soma=0, resto= 0, num=0;
		Scanner ler = new Scanner(System.in);
		//Repeti��o
		System.out.println("Para sair digite zero");
		do {
			System.out.print("Digite um n�mero: ");
			num = ler.nextInt();
			//M�ltiplo de 3
			resto = num%3;
			if(resto==0 && num!= 0) {
				cont++;
				soma+=num;
			}
		}while(num!=0);
		//M�dia dos n�meros
		media = soma/cont;
		System.out.println("=============================================");
		System.out.printf("N�mero de multiplos de 3: %1.0f",cont);
		System.out.printf("\nSoma dos n�meros multiplos de 3: %1.0f",soma);
		System.out.println("\nA M�dia dos n�meros multiplos de 3: "+media);
		System.out.println("=============================================");
		ler.close();
	}

}
