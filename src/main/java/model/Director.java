package model;

import java.util.ArrayList;

public class Director extends Participante {
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Premiacion> votaciones;

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public ArrayList<Premiacion> getVotaciones() {
		return votaciones;
	}

	public void setVotaciones(ArrayList<Premiacion> votaciones) {
		this.votaciones = votaciones;
	}

	public Director(String nombre, String sexo, int edad) {
		super(nombre, sexo, edad);
		this.peliculas = new ArrayList<>();
		this.votaciones = new ArrayList<>();
	}
}