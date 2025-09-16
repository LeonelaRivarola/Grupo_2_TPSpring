package ar.edu.unlpam.ing.TP2.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ar.edu.unlpam.ing.TP2.interfaces.LyricsInterface;
import ar.edu.unlpam.ing.TP2.model.LyricsResponse;

@Service
public class LyricsService implements LyricsInterface{
    private final RestTemplate rt = new RestTemplate();
    private final String apiURL = "https://api.lyrics.ovh/v1/";

    @Override
    public LyricsResponse buscarLetra(String artista, String cancion) {
        try{ //Encodeo los parámetros para que en caso de que haya espacios u otros caracteres especiales no rompa la URL
            String artistaEncoded = URLEncoder.encode(artista, StandardCharsets.UTF_8.toString());
            String cancionEncoded = URLEncoder.encode(cancion, StandardCharsets.UTF_8.toString());
            String url = apiURL + artistaEncoded + "/" + cancionEncoded;
            return rt.getForObject(url, LyricsResponse.class);
        }catch(Exception e){
            throw new RuntimeException("Error al buscar la letra: ", e);
        }   
    }
}