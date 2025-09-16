package ar.edu.unlpam.ing.TP2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import ar.edu.unlpam.ing.TP2.interfaces.PeliculaInterface;
import ar.edu.unlpam.ing.TP2.model.Pelicula;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    private final PeliculaInterface service;

    public PeliculaController(PeliculaInterface service) {
        this.service = service;
    }

    // GET /peliculas
    @GetMapping
    public List<Pelicula> listar() {
        return service.listar();
    }

    // GET /peliculas/buscar?titulo=Matrix
    @GetMapping("/buscar")
    public Pelicula buscarPorTitulo(@RequestParam String titulo) {
        return service.buscar(titulo);
    }

    // POST /peliculas
    @PostMapping
    public void agregar(@RequestBody Pelicula pelicula) {
        service.agregar(pelicula);
    }

    // DELETE /peliculas/{id}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}