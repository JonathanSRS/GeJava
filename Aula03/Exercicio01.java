package Execicios;
/*Fun��o: mostra os n�meros de 1000 a 1999 que dividos por 11 retornem resto 5  
 * Autor: Jonathan da Silva
 * Data 04/06/2021
 */
public class Exercicio01 {

	public static void main(String[] args) {
		//Declare
		int soma;
		//Repeti��o
		for(int i = 1000;i>=1000 && i<=1999;i++) {
			soma = i%11;
			//Condi��o
			if(soma==5) {
				System.out.println("N�mero: "+i);
			}	
		}

	}

}
