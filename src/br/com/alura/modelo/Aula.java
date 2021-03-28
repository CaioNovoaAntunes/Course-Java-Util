package br.com.alura.modelo;



public class Aula implements Comparable<Aula>{
	String titulo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	int tempo;
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getTempo() {
		return tempo;
	}


	public void setTempo(int tempo) {
		this.tempo = tempo;
	}



	
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}
	@Override
	public String toString() {
		return "[Curso: " + this.titulo + " , " + "Tempo de curso : " + this.tempo + "]";
	}
}
