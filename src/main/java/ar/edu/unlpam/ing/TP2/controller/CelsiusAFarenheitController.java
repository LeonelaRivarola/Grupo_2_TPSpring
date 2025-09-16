package ar.edu.unlpam.ing.TP2.controller;

import org.springframework.web.bind.annotation.*;
import ar.edu.unlpam.ing.TP2.interfaces.ICelsiusAFarenheit;
import ar.edu.unlpam.ing.TP2.model.CelsiusAFarenheit;

@RestController
@RequestMapping("/GET ")
public class CelsiusAFarenheitController {

    private final ICelsiusAFarenheit service;

    // Spring Boot inyecta el service automáticamente
    public CelsiusAFarenheitController(ICelsiusAFarenheit service) {
        this.service = service;
    }

    @GetMapping("/celsiusAfarenheit/{celsius}")
    public CelsiusAFarenheit convertir(@PathVariable float celsius) {
        return service.convertir(celsius);
    }
}

//localhost:8081/GET%20/celsisusAfarenheit/25