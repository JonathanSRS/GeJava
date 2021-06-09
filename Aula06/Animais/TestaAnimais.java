package Exercicio.Animais;
import Exercicio.Animais.Animal;
public class TestaAnimais {

	public static void main(String[] args) {
		cachorro C = new cachorro(); 
		Cavalos Ca = new Cavalos();
		Preguica P = new Preguica();
		ControleDeSom barulho = new ControleDeSom();
		
		C.setNome("Rex");
		C.setIdade("5 anos");
		C.setMovimento("corre");
		
		Ca.setNome("Horse");
		Ca.setIdade("2 anos");
		Ca.setMovimento("corre");
		
		P.setNome("Bob");
		P.setIdade("1 anos");
		P.setMovimento("sobe em arvores");
		
			System.out.println("Cachorro");
			System.out.println("Nome: "+ C.getNome());
			System.out.println("Idade: "+ C.getIdade());
			barulho.som(new cachorro());
			System.out.println("Movimento: "+ C.getMovimento());
			System.out.println("\nCavalo");
			System.out.println("Nome: "+ Ca.getNome());
			System.out.println("Idade: "+ Ca.getIdade());
			barulho.som(new Cavalos());
			System.out.println("Movimento: "+ Ca.getMovimento());
			System.out.println("\nPreguiça");
			System.out.println("Nome: "+ P.getNome());
			System.out.println("Idade: "+ P.getIdade());
			barulho.som(new Preguica());
			System.out.println("Movimento: "+ P.getMovimento());

		
	}

}
