package Interfaces.Exercicios;

public class Principal {

	public static void main(String[] args) {
		Polimorfismo hab = new Polimorfismo();
		Cachorro c = new Cachorro();
		Preguica p = new Preguica();
		Cavalo ca = new Cavalo();

		c.setRaca("Vira-Lata");
		c.setTipo("Canino");
		c.setTamanho(1.50);
		c.setPeso(100);
		System.out.println("Cachorrro\nPeso:"+c.getPeso()+"   \ntamanho: "+c.getTamanho());
		hab.nome(new Cachorro());
		hab.som(new Cachorro());
		hab.movimento(c);
		hab.idade(c);
		System.out.println();
		p.setPeso(90);
		p.setTamanho(1.20);
		System.out.println("Preguiça\nPeso: "+p.getPeso()+"   \ntamanho: "+p.getTamanho());
		hab.nome(p);
		hab.som(p);
		hab.movimento(p);
		hab.idade(p);
		System.out.println();
		hab.nome(ca);
		hab.som(ca);
		hab.movimento(ca);
		hab.idade(ca);
		System.out.println("cavalo\nPeso: "+ca.getPeso()+"   tamanho: "+ca.getTamanho());
		ca.setRaca("Mangalarga");
		ca.setTipo("mamifero");
		ca.setTamanho(2.10);
		ca.setPeso(200);

	}

}
