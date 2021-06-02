package br.com.generation.aula01;
/*Função: Mostrar Idade em dias
 * Autor: Jonathan da Silva
 * Data: 02/06/2021
 */
import java.util.Scanner;
import java.util.Calendar;
public class Exercicio01 {

	public static void main(String[] args) {
		//Declare
		double ano, DMes, DNasceu, DAtual, MAtual, AnoAtual;
		double CalculoD, CalculoDA, CalculoA, soma;
		//sysout
		Scanner entrada = new Scanner(System.in);
		Calendar data = Calendar.getInstance(); 
		
		System.out.println("Digite a Data do seu Aniversário");
		System.out.println("O Dia que você nasceu");
		DNasceu = entrada.nextInt();
		
		System.out.println("O mês do seu nascimento");
		DMes = entrada.nextInt();
		
		System.out.println("O ano que você nasceu");
		ano = entrada.nextInt();
		
		System.out.println(DNasceu+"/"+DMes+"/"+ano);
		System.out.println("=================");
		
		DAtual = data.get(Calendar.DAY_OF_MONTH);
		MAtual = data.get(Calendar.MONTH);
		AnoAtual = data.get(Calendar.YEAR);
		
		System.out.println("Data atual");
		System.out.println(DAtual+"/"+MAtual+"/"+AnoAtual);	
		System.out.println("=================");
		
		CalculoD=365-(30.5*DMes-1)+DNasceu;
		CalculoDA=365-(30.5*MAtual-1)+DNasceu;
		CalculoA=(AnoAtual-(ano+1))*(366);
		soma = CalculoD+CalculoDA+CalculoA;
		System.out.println("Idade em dias");
		System.out.println(soma);
		

		entrada.close();
		
	}

}
