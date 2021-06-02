package br.com.generation.aula01;
/*Função: Soma Valores
 *Autor: Jonathan da Silva
 *Data: 02/06/2021
 */

import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
	double A, B, C, D, R, S;	
	Scanner Ent = new Scanner(System.in);
	System.out.println("Digite o primeiro número");
	A = Ent.nextFloat();
	System.out.println("Digite o segundo número");
	B = Ent.nextFloat();
	System.out.println("Digite o terceiro número");
	C = Ent.nextFloat();
	R = Math.pow((A+B), 2);
	System.out.println("Resultado da primeira expressão exponencial: "+R);
	S = Math.pow(B+C, 2);
	System.out.println("Resultado da segunda expressãp exponencial: "+S);
	D = (R+S)/2;
	System.out.println("O resultado da soma final é: "+D);
	Ent.close();
	}

}
