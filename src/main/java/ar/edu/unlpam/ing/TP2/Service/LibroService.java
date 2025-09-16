package ar.edu.unlpam.ing.TP2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unlpam.ing.TP2.interfaces.LibroInterface;
import ar.edu.unlpam.ing.TP2.model.Libro;

@Service
public class LibroService implements LibroInterface{
    private List<Libro> libros = new ArrayList<>();

    @Override
    public List<Libro> listarLibros() {
        return libros;
    }

    @Override
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Libro obtenerLibroPorId(int id) {
        Libro libro = null;
        for(Libro l : libros){
            if(l.getId() == id){
                libro = l;
            }
        }
        return libro;
    }

    @Override
    public void eliminarLibro(int id) {
        libros.removeIf(l -> l.getId() == id);
    }   
}
