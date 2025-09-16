package ar.edu.unlpam.ing.TP2.model;

public class Pelicula {
    private static int nextId = 0;
    private int id;
    private String titulo;
    private String director;
    private int anio;
    private String genero;

    public Pelicula(String titulo, String director, int anio, String genero) {
        this.id = nextId++;
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getAnio() {
        return anio;
    }

    public String getGenero() {
        return genero;
    }
}