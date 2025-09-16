package ar.edu.unlpam.ing.TP2.Service;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlpam.ing.TP2.interfaces.iLibro;
import ar.edu.unlpam.ing.TP2.model.Libro;


public class LibroService implements iLibro {

    private List<Libro> libros = new ArrayList<>();

    @Override
    public List<Libro> listar() {
        return libros;
    }

    @Override
    public void agregar(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Libro buscar(int id) {

        for(int i=0; i<libros.size(); i++){
            if(id == libros.get(i).getId()){
                return libros.get(i);
            }
        }
        return null;
    }

    @Override
    public String eliminar(int id) {
        for(int i=0; i<libros.size(); i++){
            if(id == libros.get(i).getId()){
                libros.remove(i);
                return new String("Libro eliminado.");
            }
        }
        return new String("El libro no existe.");
    }
    
}
