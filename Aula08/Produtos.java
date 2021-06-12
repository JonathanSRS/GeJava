package collections.Exercicios;

import java.util.ArrayList;

public class Produtos {

private String nome;
private String Categoria;
private int quantidade;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCategoria() {
	return Categoria;
}
public void setCategoria(String categoria) {
	Categoria = categoria;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
public Produtos(String nome, String categoria, int quantidade) {
	super();
	this.nome = nome;
	Categoria = categoria;
	this.quantidade = quantidade;
}
@Override
public String toString() {
	return "Produtos [nome=" + nome + ", Categoria=" + Categoria + ", quantidade=" + quantidade + "]";
}



}
