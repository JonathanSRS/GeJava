package br.com.generation.aula01;
/*Função: Converte segundos em horas e minutos
 *Autor: Jonathan da Silva
 *Data: 02/06/2021
 */
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		double Segundos, Min, Horas;
		Scanner add = new Scanner(System.in);
		System.out.println("Digite o tempo de duração do evento");
		System.out.println("Em Segundos");
		
		Segundos = add.nextDouble();
		
		Horas = Math.round(Segundos/3600);
		Min = Math.round(Segundos/60);
		
		System.out.println("Tempo de duração em Minutos: " +Min);
		System.out.println("Tempo de duração em Horas: "+Horas);
		add.close();
	

	}

}
