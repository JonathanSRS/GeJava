package Execicios;
/*Função: mostra os números de 1000 a 1999 que dividos por 11 retornem resto 5  
 * Autor: Jonathan da Silva
 * Data 04/06/2021
 */
public class Exercicio01 {

	public static void main(String[] args) {
		//Declare
		int soma;
		//Repetição
		for(int i = 1000;i>=1000 && i<=1999;i++) {
			soma = i%11;
			//Condição
			if(soma==5) {
				System.out.println("Número: "+i);
			}	
		}

	}

}
