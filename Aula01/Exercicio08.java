package br.com.generation.aula01;
/*Fun��o: Calcular custo final do ve�culo ao consumidor
 *Autor: Jonathan da Silva
 *Data 02/06/2021 
 */
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		double CustoFabri, soma;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o Custo de fabrica��o do ve�culo");
		CustoFabri = ent.nextDouble();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Distribui��o 28% sobre o valor de fabrica��o");
		System.out.println("Imposto 45% sobre o valor de fabrica��o");
		soma = CustoFabri + ((CustoFabri*0.28) + (CustoFabri*0.45));
		System.out.println("=====================================");
		System.out.println("Valor final do ve�culo: R$"+soma);
		System.out.println("=====================================");
		ent.close();
		
		
	}

}
