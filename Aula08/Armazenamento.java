package collections.Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Armazenamento {
	public static void main(String[] args) {
		
		char resp = 'S';
		String nome, Categoria;
		int quantidade;
		int op = 0;
		Scanner ler = new Scanner(System.in);
		ArrayList<Produtos> produto = new ArrayList();
		System.out.println("Escolha uma opção");
		do {
			System.out.print("*\n================"
					+ "\n1- Adicionar produtos"
					+ "\n2- Atualizar estoque "
					+ "\n3- Remover produto do estoque"
					+ "\n4- Lista "
					+ "\n5- Sair"
					+ "\n*================\n");
			op = ler.nextInt();
			switch(op) {
			case 1:
				for(;resp == 'S';) {
					System.out.println("Digite o nome do produto");
					nome = ler.next();
					System.out.println("Digite categoria");
					Categoria = ler.next();
					System.out.println("Digite quantidade");
					quantidade = ler.nextInt();
					produto.add(new Produtos (nome, Categoria, quantidade));
					System.out.print("Digite S para adicionar um novo produto e N para sair "
							+ "+\nResposta: ");
					resp = ler.next().charAt(0);
			}
			break;
			case 2:
				for(int i = 0; i<produto.size();i++) {
					System.out.println(i + "º" + produto.get(i));
				}
				System.out.println("qual dessas posições você deseja alterar?");
				System.out.println("Digite essa bagaça");
				nome = ler.next();
				System.out.println("Digite categoria");
				Categoria = ler.next();
				System.out.println("Digite quantidade");
				quantidade = ler.nextInt();
				//produto.add(new Produtos (nome, Categoria, quantidade));
				int excluir = ler.nextInt();
				produto.get(excluir).setNome(nome);
				produto.get(excluir).setCategoria(Categoria);
				produto.get(excluir).setQuantidade(quantidade);
			break;
			case 3:
				for(int i = 0; i<produto.size();i++) {
					System.out.println(i + "º" + produto.get(i));
				}
				System.out.println("qual dessas posições você deseja excluir?");
				excluir = ler.nextInt();
				produto.remove(excluir);
				
			break;
			case 4:
				System.out.println(produto);
			break;
			}
			resp = 'S';
		}while(op != 5);
		
		//produtos.add(new Produtos(Nome, Categoria, Quantidade));
	}

}
