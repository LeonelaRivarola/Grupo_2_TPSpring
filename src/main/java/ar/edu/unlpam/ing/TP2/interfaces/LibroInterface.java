package ar.edu.unlpam.ing.TP2.interfaces;

import java.util.List;

import ar.edu.unlpam.ing.TP2.model.Libro;

public interface LibroInterface {
    List<Libro> listarLibros();
    void agregarLibro(Libro libro);
    Libro obtenerLibroPorId(int id);
    void eliminarLibro(int id);
}
