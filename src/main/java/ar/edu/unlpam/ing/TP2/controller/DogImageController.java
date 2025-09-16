package ar.edu.unlpam.ing.TP2.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ar.edu.unlpam.ing.TP2.Service.DogImageService;
import ar.edu.unlpam.ing.TP2.model.DogImageResponse;

@RestController
public class DogImageController {
    private final DogImageService service;
    private final ObjectMapper om = new ObjectMapper();

    public DogImageController(DogImageService service){
        this.service = service;
    }

    @GetMapping("/dog")
    public String getDogImage() throws JsonProcessingException {
        DogImageResponse dir = service.getDogImage();

        HashMap<String, Object> response = new HashMap<>();
        response.put("mensaje", dir.getMessage());
        response.put("estado", dir.getStatus());
        
        return om.writeValueAsString(response);
    }
}