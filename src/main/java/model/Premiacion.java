package model;

import java.util.ArrayList;
import java.util.List;

public class Premiacion {
    private List<Pelicula> peliculas;
    private List<Director> directores;

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Director> getDirectores() {
        return directores;
    }

    public void setDirectores(List<Director> directores) {
        this.directores = directores;
    }

    public Premiacion() {
        this.peliculas = new ArrayList<>();
        this.directores = new ArrayList<>();
    }
    public List<Pelicula> peliculasGanadoras (String titulo, Categoria categoria){
        List<Pelicula> premiadas =  new ArrayList<>();
        for(Pelicula pelicula : this.peliculas){
            if(pelicula.getTitulo().equals(titulo)&&pelicula.getCategoria().equals(categoria)){
                premiadas.add(pelicula);
            }
        } return premiadas;
    }
    public List<Actor> actoresPelicula (Pelicula pelicula){
        return pelicula.getActores();
    }
    public List<Actor> actoresPeliculaGanadora(String titulo, Categoria categoria) {
        List<Actor> actoresParticipantes = new ArrayList<>();
        for (Pelicula pelicula : this.peliculas) {
            if (pelicula.getTitulo().equals(titulo) && pelicula.getCategoria().equals(categoria)) {
                actoresParticipantes = pelicula.getActores();
                break;
            }
        }
        return actoresParticipantes;
    }
    public List<String> directoresYactores() {
        List<String> directoresYactores = new ArrayList<>();
        for (Director director : this.directores) {
            directoresYactores.add("Director: " + director.getNombre());
        }
        for (Pelicula pelicula : this.peliculas) {
            for (Actor actor : pelicula.getActores()) {
                directoresYactores.add("Actor: " + actor.getNombre());
            }
        }
        return directoresYactores;
    }
}