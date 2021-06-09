package OriencaoaoObjetoExercicios;

public class Funcionario {
	String Nome;
	String Empresa;
	String Cargo;
	int Dias;
	int horasTrab;
	int ValorH;
	
	public int CalculoHoraEx(int dias,int hora, int Valor) {
		
		return (dias*hora)*Valor;
	}
	void mostrar() {
		System.out.println("======"+Empresa+"======="+"\nNome:"+Nome+"    "+"Cargo"+Cargo);
	}

}
