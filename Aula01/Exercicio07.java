package br.com.generation.aula01;
/*Função: Equação Linear
 * Autor Jonathan da Silva
 * Data: 02/06/2021
 */
import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		double A, B, C, D, E, F, X, Y;
		Scanner ent = new Scanner(System.in);
		System.out.println("Equação a ser resolvida");
		System.out.println("==============================================================");
		System.out.println("x = (CE -BF)" + "     "+" Y = (AE - BD)");
		System.out.println("_____________________________________");
		System.out.println("    (AF - CD)" + "     "+"    (AE - BD)");
		System.out.println("==============================================================");
		System.out.println("Escreva os valores dos 6 coeficientes");
		System.out.println("Digite o valor de A : ");
		A = ent.nextDouble();
		System.out.println("Digite o valor de B");
		B = ent.nextDouble();
		System.out.println("Digite o valor de C");
		C = ent.nextDouble();
		System.out.println("Digite o valor de D");
		D = ent.nextDouble();
		System.out.println("Digite o valor de E");
		E = ent.nextDouble();
		System.out.println("Digite o valor de F");
		F = ent.nextDouble();
		System.out.println("==============================================================");
		System.out.println("x = (" + C + " x "+ E + " - " + B + " x "+ F + ")" + "     " + "Y = (" + A + " x "+ E + " - " + B + " x " + D + ")");
		System.out.println("____________________________________________________________");
		System.out.println("    ("+ A+ " x " +F + " - " + C+ " x " +D +")" + "     "+"    (" + A+ " x " +E + " - " + B+ " x " +D + ")");
		X = Math.round(((C*E)-(B*F))/((A*E)-(B*D))); 
		Y = Math.round(((A*F)-(C*D))/((A*E)-(B*D)));
		System.out.println("==============================================================");
		System.out.print("Os pontos X e Y são: "+X+" e "+Y);
		ent.close();

	}

}
