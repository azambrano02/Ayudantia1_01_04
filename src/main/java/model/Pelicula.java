package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
	private LocalDate fechaEstreno;
	private String titulo;
	private int duracion;
	private String sinopsis;
	private ArrayList<Actor> actores = new ArrayList<Actor>();
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
}