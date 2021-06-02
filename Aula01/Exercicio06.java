package br.com.generation.aula01;
/*Função: Calcular Distância
 *Autor Jonathan da Silva
 *Data: 02/06/2021
 */
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		double D, X, Y, S;
		Scanner ent = new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("raiz(X2-X1)² + (Y2-Y1)²");
		System.out.println("=====================");
		System.out.println("Informa o Valor de X");
		X = ent.nextDouble();
		System.out.println("Informa o Valor de Y");
		Y = ent.nextDouble();
		System.out.println("=====================================");
		System.out.println("raiz("+ X +" x 2 - " + X + " x 1)² + (" + Y + " x 2 - "+ Y +" x 1)²");
		D = Math.round(Math.sqrt(Math.pow((X*2)-(X*1), 2)+Math.pow((Y*2)-(Y*1), 2)));
		S = Math.pow((X*2)-(X*1), 2)+Math.pow((Y*2)-(Y*1), 2);
		System.out.println("=====================================");
		System.out.println("raiz "+S);
		System.out.print("O Valor da distância: "+D);
		ent.close();
		

	}

}
