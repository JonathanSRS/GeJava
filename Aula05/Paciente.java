package OriencaoaoObjetoExercicios;
import java.util.Scanner;
public class Paciente {
	private String NomeDMedico;
	private String NPaciente;
	private String EstadoClinico;
	private String Medicamento;
	private String Receita;
	Scanner ler = new Scanner(System.in);

		
	public String getNomeDMedico() {
		return NomeDMedico;
	}
	public void setNomeDMedico(String nomeDMedico) {
		NomeDMedico = nomeDMedico;
	}
	public String getNPaciente() {
		return NPaciente;
	}
	public void setNPaciente(String nPaciente) {
		NPaciente = nPaciente;
	}
	public String getEstadoClinico() {
		return EstadoClinico;
	}
	public void setEstadoClinico(String estadoClinico) {
		EstadoClinico = estadoClinico;
	}
	public String getMedicamento() {
		return Medicamento;
	}
	public void setMedicamento(String medicamento) {
		Medicamento = medicamento;
	}
	public String getReceita() {
		return Receita;
	}
	public void setReceita(String receita) {
		Receita = receita;
	}
	public Scanner getLer() {
		return ler;
	}
	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	void status() {
		if(EstadoClinico == "BOM") {
			System.out.println("Nome do médico");
			NomeDMedico = ler.nextLine();
		}else if(EstadoClinico == "Ruim") {
			System.out.println("Nome do médico");
			NomeDMedico = ler.nextLine();
			System.out.println("Receitar medicamento");
			Medicamento = ler.nextLine();
			Receita = Medicamento;
			
		}
	}
}
