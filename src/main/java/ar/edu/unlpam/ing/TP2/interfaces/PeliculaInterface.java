package ar.edu.unlpam.ing.TP2.interfaces;

import java.util.List;

import ar.edu.unlpam.ing.TP2.model.Pelicula;

public interface PeliculaInterface {
    List<Pelicula>listar();
    Pelicula buscar(String titulo);
    void agregar(Pelicula p);
    void eliminar(int id);
}