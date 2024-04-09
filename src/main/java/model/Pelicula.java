package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
	private LocalDate fechaEstreno;
	private String titulo;
	private int duracion;
	private String sinopsis;
	private ArrayList<Actor> actores;
	private Director director;
	private Categoria categoria;

	public LocalDate getFechaEstreno() {
		return this.fechaEstreno;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getSinopsis() {
		return this.sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public ArrayList<Actor> getActores() {
		return actores;
	}
	public void setActores(ArrayList<Actor> actores) {
		this.actores = actores;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Pelicula(LocalDate fechaEstreno, String titulo, int duracion, String sinopsis, Director director, Categoria categoria) {
		this.fechaEstreno = fechaEstreno;
		this.titulo = titulo;
		this.duracion = duracion;
		this.sinopsis = sinopsis;
		this.actores = new ArrayList<>();
		this.director = director;
		this.categoria = categoria;
	}
}