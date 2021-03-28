package br.com.alura.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	String nome;
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	
	}

	String instrutor;
	List<Aula> aulas = new ArrayList<Aula>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}
	public void adiciona(Aula aula) {
		 this.aulas.add(aula);
	}
	public int getTempoTotal() {
		return aulas.stream().mapToInt(Aula::getTempo).sum();
		
	}
	@Override
	public String toString() {

		return "[Curso: " + this.nome + "Instrutor preferido: " + this.instrutor + ""+ "]";
	}
}
