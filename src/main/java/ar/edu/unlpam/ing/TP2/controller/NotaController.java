package ar.edu.unlpam.ing.TP2.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlpam.ing.TP2.interfaces.NotaInterface;
import ar.edu.unlpam.ing.TP2.model.Nota;

@RestController
@RequestMapping("/notas")
public class NotaController {
    private final NotaInterface service;

    public NotaController(NotaInterface service) {
        this.service = service;
    }

    @GetMapping
    ArrayList<Nota> mostrarNotas(){
        return service.listar();
    }

    @PostMapping
    void crearNota(@RequestBody Nota nota){
        service.crear(nota);
    }

    @PutMapping("/{id}")
    void actualizarNota(@PathVariable int id, @RequestBody Nota nota) {
        service.actualizar(nota.getTitulo(), nota.getContenido(), id);
    }
    
    @DeleteMapping("/{id}")
    void eliminarNota(@PathVariable int id){
        service.eliminar(id);
    }
}