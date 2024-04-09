package model;

import java.util.ArrayList;

public class Actor extends Participante {
	private ArrayList<Pelicula> peliculas;
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	public Actor(String nombre, String sexo, int edad) {
		super(nombre, sexo, edad);
		this.peliculas = new ArrayList<>();
	}
}