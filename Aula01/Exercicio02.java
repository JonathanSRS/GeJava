package br.com.generation.aula01;
/*Fun��o: Ler a idade em dias e mostrar em m�s e anos
 * Autor: Jonathan da Silva
 * Data: 02/06/2021
 */
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		int IdDias, IdMes, IdAnos; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor, digite sua idade me total de dias");
		IdDias = entrada.nextInt();
		IdMes = IdDias/12;
		IdAnos = IdDias/365;
		System.out.println("Voc� tem "+IdAnos+" Anos,"+ "\nSua idade em Meses � de: "+IdMes+" Meses");	
		entrada.close();
	}

}
