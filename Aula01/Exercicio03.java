package br.com.generation.aula01;
/*Fun��o: Converte segundos em horas e minutos
 *Autor: Jonathan da Silva
 *Data: 02/06/2021
 */
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		double Segundos, Min, Horas;
		Scanner add = new Scanner(System.in);
		System.out.println("Digite o tempo de dura��o do evento");
		System.out.println("Em Segundos");
		
		Segundos = add.nextDouble();
		
		Horas = Math.round(Segundos/3600);
		Min = Math.round(Segundos/60);
		
		System.out.println("Tempo de dura��o em Minutos: " +Min);
		System.out.println("Tempo de dura��o em Horas: "+Horas);
		add.close();
	

	}

}
