package br.com.generation.aula01;
/*Função: Calcular custo final do veículo ao consumidor
 *Autor: Jonathan da Silva
 *Data 02/06/2021 
 */
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		double CustoFabri, soma;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o Custo de fabricação do veículo");
		CustoFabri = ent.nextDouble();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Distribuição 28% sobre o valor de fabricação");
		System.out.println("Imposto 45% sobre o valor de fabricação");
		soma = CustoFabri + ((CustoFabri*0.28) + (CustoFabri*0.45));
		System.out.println("=====================================");
		System.out.println("Valor final do veículo: R$"+soma);
		System.out.println("=====================================");
		ent.close();
		
		
	}

}
