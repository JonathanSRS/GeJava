package Execicios;
/*Fun��o: 
 *Autor: Jonathan da Silva 
 *Data: 04/06/2021
 */
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		//Declare
		int idade,M50=0,M21=0;
		Scanner so = new Scanner(System.in);
		//Entrada
		System.out.println("Digite a idade");
		idade = so.nextInt();
		//Verficar n�o negativo
		if(idade>0) {
			//Repeti��o
			while(idade!=-99) {
				//Condi��o
				if(idade>=1 && idade<=21) {
					M21++;
				}
				if(idade>=50) {
					M50++;
				}
				System.out.println("Digite a idade");
				idade = so.nextInt();
			}
			//Total de pessoas com menos de 21 anos
			System.out.println("===============================");
			System.out.println("Pessoas com menos de 21 anos: "+M21);
			System.out.println("===============================");
			//Total de pessoas com mais de 50 anos
			System.out.println("===============================");
			System.out.println("Pessoas com mais de 50 anos: "+M50);
			System.out.println("===============================");
		}
		else {
			System.out.println("n�mero negativo n�o permitido");
		}
		so.close();

	}

}
