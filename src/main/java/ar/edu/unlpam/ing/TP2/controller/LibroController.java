package ar.edu.unlpam.ing.TP2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlpam.ing.TP2.interfaces.LibroInterface;
import ar.edu.unlpam.ing.TP2.model.Libro;

@RestController
@RequestMapping("/libros")
public class LibroController {
    private final LibroInterface service;

    public LibroController(LibroInterface service) {
        this.service = service;
    }

    @GetMapping
    public List<Libro> listar(){
        return service.listarLibros();
    }

    @PostMapping
    public void agregar(@RequestBody Libro libro){
        service.agregarLibro(libro);
    }

    @GetMapping("/{id}")
    public Libro obtenerPorId(@PathVariable int id){
        return service.obtenerLibroPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id){
        service.eliminarLibro(id);
    }
}