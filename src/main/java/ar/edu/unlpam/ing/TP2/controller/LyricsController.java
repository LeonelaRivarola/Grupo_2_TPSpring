package ar.edu.unlpam.ing.TP2.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ar.edu.unlpam.ing.TP2.interfaces.LyricsInterface;
import ar.edu.unlpam.ing.TP2.model.LyricsResponse;

@RestController
public class LyricsController {
    private final LyricsInterface service;
    private final ObjectMapper om = new ObjectMapper();

    public LyricsController(LyricsInterface service) {
        this.service = service;
    }

    @GetMapping("/lyrics")
    public String buscar(@RequestParam String artista, @RequestParam String cancion) throws JsonProcessingException {
        LyricsResponse r = service.buscarLetra(artista, cancion);
        HashMap<String, Object> response = new HashMap<>();
        
        response.put("artista", artista);
        response.put("cancion", cancion);
        response.put("letra", r.getLyrics());

        return om.writeValueAsString(response);
    }
}