package ar.edu.unlpam.ing.TP2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlpam.ing.TP2.interfaces.InvertirInterface;
import ar.edu.unlpam.ing.TP2.model.Invertir;

@RestController
@RequestMapping("/GET ")
public class InvertirController {
    private final InvertirInterface service;

    InvertirController(InvertirInterface service){
        this.service = service;
    }

    @GetMapping("/invertir/{original}")
    public Invertir invertir(@PathVariable String original){
        return service.invertir(original);
    }

}
