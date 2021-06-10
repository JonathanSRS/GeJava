package Interfaces.Exercicios;

public class Cachorro extends atribuido implements Interface {

	@Override
	public void som() {
		System.out.println("AAAAAAAAAAAAuuu!");
		
	}

	@Override
	public void movimento() {
		System.out.println("corre corre Florest corre");
		
	}

	@Override
	public void idade() {
		// TODO Auto-generated method stub
		System.out.println("9 anos");
	}

	@Override
	public void nome() {
		System.out.println("Florest");
		
	}

}
