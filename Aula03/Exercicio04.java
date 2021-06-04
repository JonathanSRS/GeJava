package Execicios;
/*Função: Pesquisar comportamento
 *Autor: Jonathan da Silva 
 *Data: 04/06/2021
 */
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		//Declare
		int Pessoas, num, idade, MuNer=0, PeCalmas=0, HomAgr=0, OutCal=0,PessNerMais40=0,PessCalMenos18=0, ref;
		char Sexo='N', temperamento='I';
		
		Scanner ler = new Scanner(System.in);
		//Quantidade de entrevistados
		System.out.print("Digite quantidade de pessoas a serem entrevistadas: ");
		Pessoas = ler.nextInt();
		System.out.println("=====================================================");
		num=Pessoas;
		//Repetição
		while(num<=Pessoas && num>=1) {
			//Idade
			System.out.print("Informe sua idade: ");
			idade = ler.nextInt();
			System.out.println("=====================================================");
			if(idade>0) {
				//Sexo
				System.out.println("=====================================================");
				System.out.println("Informe seu sexo.");
				System.out.println("Para digite Masculino: 1, Feminino: 2, Outro: 3");
				ref = ler.nextInt();
				System.out.println("=====================================================");
				switch(ref) {
					case 1:
						Sexo = 'M';
					break;
					case 2:
						Sexo = 'F';
					break;
					case 3:
						Sexo = 'O';
					break;
					default:
						System.out.println("Valor invalido");
					break;
				}
				if(ref>=1 && ref<=3) {
					//Temperamento
					System.out.println("=====================================================");
					System.out.println("Informe o temperamento do entrevistada");
					System.out.println("Para digite: 1 calma, 2 nervosa, 3 agressiva");
					ref = ler.nextInt();
					System.out.println("=====================================================");
					switch(ref) {
					case 1:
						temperamento = 'C';
					break;
					case 2:
						temperamento = 'N';
					break;
					case 3:
						temperamento = 'A';
					break;
					default:
						System.out.println("Valor invalido");
						num++;
					break;
					}
					num--;
				}else {
					System.out.println("Digite o valor novamente!");
				}
				if(temperamento == 'C'){
					PeCalmas++;
				}
				if(idade>=40 && temperamento =='N'){
					PessNerMais40++;
				}
				if(Sexo =='F' && temperamento=='N') {
					MuNer++;
				}
				if(Sexo =='M'&& temperamento=='A') {
					HomAgr++;
				}
				if(Sexo=='O' && temperamento=='C') {
					OutCal++;
				}
				if(idade<=18 && temperamento =='C'){
					PessCalMenos18++;
				}
			}else {
				System.out.println("Valor invalido");
			}
		}
		//Mostra pessoas calmas
		System.out.println("Pessoas calmas Nº: "+PeCalmas);
		//Mostra mulheres nervosas
		System.out.println("Mulheres nervosas Nº: "+MuNer);
		//Mostra homens agressivos
		System.out.println("Homens agressivos Nº: "+HomAgr);
		//Mostra outros calmos
		System.out.println("Outros calmos Nº: "+OutCal);
		//Mostra pessoas calmas com menos de 18
		System.out.println("Pessoas calmas com menos de 18 anos: Nº: "+PessCalMenos18);
		//Mostra pessoas nervosas com mais de 40
		System.out.println("Pessoas nervosas com mais de 40 anos Nº: "+PessNerMais40);
		System.out.println("=====================================================");
		ler.close();

	}

}
