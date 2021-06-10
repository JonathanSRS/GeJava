package Interfaces.Exercicios;

public class Polimorfismo {
	public void som(Interface heysom) {
		System.out.print("som: ");
		heysom.som();
		
	}
	public void idade(Interface heysom) {
		System.out.print("idade: ");
		heysom.idade();
		
	}
	public void nome(Interface heysom) {
		System.out.print("nome: ");
		heysom.nome();
		
	}
	public void movimento(Interface heysom) {
		System.out.println("movimento");
		heysom.movimento();
		
	}	

}
