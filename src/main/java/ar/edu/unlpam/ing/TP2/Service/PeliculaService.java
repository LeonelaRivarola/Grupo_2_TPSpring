package ar.edu.unlpam.ing.TP2.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unlpam.ing.TP2.interfaces.PeliculaInterface;
import ar.edu.unlpam.ing.TP2.model.Pelicula;

@Service
public class PeliculaService implements PeliculaInterface{
    List<Pelicula> peliculas = new java.util.ArrayList<>();
    
    @Override
    public List<Pelicula> listar() {
        return peliculas;
    }

    @Override
    public Pelicula buscar(String titulo) {
        for (Pelicula p: peliculas){
            if(p.getTitulo().equalsIgnoreCase(titulo)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void agregar(Pelicula p) {
        peliculas.add(p);
    }

    @Override
    public void eliminar(int id) {
        peliculas.removeIf(p -> p.getId() == id);
    }

}