package ar.edu.unlpam.ing.TP2.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ar.edu.unlpam.ing.TP2.interfaces.EstadisticasInterface;
import ar.edu.unlpam.ing.TP2.model.NumerosRequest;

@RestController
@RequestMapping("/POST ")
public class EstadisticasController {
    private final EstadisticasInterface service;
    private final ObjectMapper map = new ObjectMapper();
    
    public EstadisticasController(EstadisticasInterface service) {
        this.service = service;
    }

    @PostMapping("/estadisticas")
    public String calcular(@RequestBody String json) throws JsonProcessingException{
        //Convierto el json en un objeto de tipo NumerosRequest
        NumerosRequest request = map.readValue(json, NumerosRequest.class);
        //HashMap para almacenar las respuestas
        HashMap<String, Object> response= new HashMap<>();
        //Llamo a los métodos para armar el JSON
        response.put("promedio", service.promedio(request));
        response.put("maximo", service.maximo(request));
        response.put("minimo", service.minimo(request));
        response.put("cantidad", service.cantidad(request));
        //Convierto el objeto de respuesta en un json y lo retorno
        return map.writeValueAsString(response);
    }
}