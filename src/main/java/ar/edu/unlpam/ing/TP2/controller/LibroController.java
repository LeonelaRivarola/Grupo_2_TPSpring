package ar.edu.unlpam.ing.TP2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlpam.ing.TP2.model.Libro;
import ar.edu.unlpam.ing.TP2.Service.LibroService;


@RestController
public class LibroController {

    /*Otra idea que se me ocurrió es que Gesto tuviera todos sus método estáticos y el atributo List también. */
    private LibroService g = new LibroService();

    @GetMapping("/libros")
    public List<Libro> getLibros() {
        return g.listar();
    }

    @PostMapping("/libros")
    public void postLibro(@RequestBody Libro nuevoLibro) {
        g.agregar(nuevoLibro);
    } 

    @GetMapping("/libros/{id}")
    public Libro getLibro(@PathVariable int id) {
        return g.buscar(id);
    }

    @DeleteMapping("/libros/{id}")
    public String deleteLibro(@PathVariable int id) {
        return g.eliminar(id);
    }    
}
