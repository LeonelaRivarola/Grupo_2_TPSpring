package ar.edu.unlpam.ing.TP2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlpam.ing.TP2.interfaces.EsPrimoInterface;
import ar.edu.unlpam.ing.TP2.model.EsPrimo;

@RestController
@RequestMapping("/GET ")
public class EsPrimoController {
    private final EsPrimoInterface service;

    public EsPrimoController(EsPrimoInterface service) {
        this.service = service;
    }

    @GetMapping("/esPrimo/{num}")
    public EsPrimo esprimo(@PathVariable int num) {
        return service.esprimo(num);
    }
}
