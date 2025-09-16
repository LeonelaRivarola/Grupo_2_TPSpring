package ar.edu.unlpam.ing.TP2.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.edu.unlpam.ing.TP2.interfaces.HorarioInterface;

@RestController
public class HorarioController {
    private final HorarioInterface service;
    private final ObjectMapper mapper = new ObjectMapper();

    public HorarioController(HorarioInterface service) {
        this.service = service;
    }

    @GetMapping("/hora")
    public String convertirHora(@RequestParam String fecha, @RequestParam String origen, @RequestParam String destino) throws Exception{

        // llamamos al service que nos devuelve el resultado
        var resultado = service.convertir(fecha, origen, destino);

        // creamos el hashmap con los datos a devolver
        HashMap<String, Object> response = new HashMap<>();
        response.put("origen", resultado.getOrigen());
        response.put("destino", resultado.getDestino());

        // lo convertimos a JSON con ObjectMapper
        return mapper.writeValueAsString(response);
    }
}