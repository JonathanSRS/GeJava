package br.com.generation.aula01;
/*Fun��o: Soma Valores
 *Autor: Jonathan da Silva
 *Data: 02/06/2021
 */

import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
	double A, B, C, D, R, S;	
	Scanner Ent = new Scanner(System.in);
	System.out.println("Digite o primeiro n�mero");
	A = Ent.nextFloat();
	System.out.println("Digite o segundo n�mero");
	B = Ent.nextFloat();
	System.out.println("Digite o terceiro n�mero");
	C = Ent.nextFloat();
	R = Math.pow((A+B), 2);
	System.out.println("Resultado da primeira express�o exponencial: "+R);
	S = Math.pow(B+C, 2);
	System.out.println("Resultado da segunda express�p exponencial: "+S);
	D = (R+S)/2;
	System.out.println("O resultado da soma final �: "+D);
	Ent.close();
	}

}
