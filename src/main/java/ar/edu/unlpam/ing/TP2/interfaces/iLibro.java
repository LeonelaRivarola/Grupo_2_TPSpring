package ar.edu.unlpam.ing.TP2.interfaces;
import java.util.List;

import ar.edu.unlpam.ing.TP2.model.Libro;

public interface iLibro {
    public List<Libro> listar();
    public void agregar(Libro libro);
    public Libro buscar(int id);
    public String eliminar(int id);
}
