package Execicios;
/*Fun��o: ler n�mero digitados e fazer a soma
 *Autor: Jonathan da Silva
 *Data: 04/06/2021
 */
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		//Declare
		int num, soma = 0;
		Scanner ler = new Scanner(System.in);
		//Repeti��o
		do {
		//Entrada
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt(); 
		//Soma
		soma += num;
		}while(num>0);
		System.out.println("Resultado da soma: "+soma);
		ler.close();

	}

}
