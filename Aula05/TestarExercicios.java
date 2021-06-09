package OriencaoaoObjetoExercicios;

import java.util.Scanner;

/*Função:
 * Autor:
 * Data: 08/06/2021
 */
public class TestarExercicios {

	public static void main(String[] args) {
		int Op = 0;
		String usuario1 = "";
		System.out.println("Testar Exercícios");
		System.out.println("Digite uma da opções");
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Opções para teste"+
					"\n1: Cliente\n2: ProdutoEle\n3: Paciente\n4: Avião\n5: Bancaria\n6: Funcionario"
					+"\n7: Patinete\n8: Sair");
			Op = ler.nextInt();
		switch(Op) {
		case 1:
			Cliente c = new Cliente(); 
			c.NOME = usuario1 = ler.nextLine();
			System.out.println("Seu nome: ");
			c.NOME = usuario1 = ler.nextLine();
			System.out.println("Seu CPF: ");
			c.CPF = usuario1 = ler.nextLine();
			System.out.println("Sua Data de aniversário: ");
			c.Aniversario = usuario1 = ler.nextLine();
			System.out.println("Seu RG: ");
			c.RG = usuario1 = ler.nextLine();
			System.out.println("Seu E-mail: ");
			c.email = usuario1 = ler.nextLine();
			c.cadastro();
			System.out.println();
		break;
		case 2:
			ProdutoEletro P =  new ProdutoEletro();
			System.out.println("Digite o Preço dos  produtos");
			System.out.print("Processador: ");
			P.Processador = ler.nextInt();
			System.out.print("Placa-Mãe: ");
			P.PlacaMae = ler.nextInt();
			System.out.print("HD: ");
			P.HD =  ler.nextInt();
			System.out.print("Fonte: ");
			P.Fonte =  ler.nextInt();
			System.out.print("Memoria Ram: ");
			P.Ram =  ler.nextInt();
			P.preco();
			System.out.println();
		break;
		case 3:
			Paciente M = new Paciente();
			M.setNomeDMedico(ler.nextLine());
			System.out.println("Nome do Paciente");
			M.setNPaciente(ler.nextLine());
			//set
			System.out.println("Estado do paciente Bom ou Ruim");
			M.setEstadoClinico(ler.nextLine());
			M.status();
			System.out.println("Deseja visualizar a receita completa S/N");
			usuario1 = ler.nextLine();
			if(usuario1 == "Sim") {
			System.out.println("Nome do Paciente: "+M.getNPaciente()+
			  "\nNome do Médico:"+M.getNomeDMedico()+
			  "\n========"+M.getReceita()+
			  "\n===============");
			 
			}
			System.out.println();
		break;
		case 4:
			Aviao A = new Aviao();
			System.out.println("Insira o as horas de voo e a velocidade respectivamente");
			A.temp = ler.nextInt();
			A.velo = ler.nextInt();
			System.out.println("Distância de voo: "+A.TempoVoo(A.temp, A.velo));
			System.out.println();
		break;
		case 5:
			Bancaria B = new Bancaria();
			B.Nome = usuario1 = ler.nextLine();
			System.out.println("Digite seu Nome");
			B.Nome = usuario1 = ler.nextLine();
			System.out.println("Digite seu CPF");
			B.CPF = usuario1 = ler.nextLine();
			System.out.print("Informe o valor da sua renda:");
			B.Renda = ler.nextInt();
			B.AbrirConta();
			System.out.println();
		break;
		case 6:
			Funcionario F = new Funcionario();
			usuario1 = ler.nextLine();
			System.out.println("Nome da Empresa");
			F.Empresa = ler.nextLine();
			System.out.println("Digite seu Nome");
			F.Nome = ler.nextLine();
			System.out.println("Digite seu Cargo");
			F.Cargo = ler.nextLine();
			System.out.println("Digite o valor da hora extra");
			F.ValorH = ler.nextInt();
			System.out.println("Quantidade de dias trabalhados");
			F.Dias = ler.nextInt();
			System.out.println("Quantidade de horas trabalhadas");
			F.horasTrab = ler.nextInt();
			F.mostrar();
			System.out.println("Valor a receber por Horas Extras: R$"+F.CalculoHoraEx(F.Dias, F.horasTrab, F.ValorH));
			System.out.println();
		break;
		case 7:
			
		break;
		case 8:
		break;
		default:
			System.out.println("Valor invalido");
		break;
		}
		}while(Op !=8);
		ler.close();

	}

}
