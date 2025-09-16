package ar.edu.unlpam.ing.TP2.interfaces;

import ar.edu.unlpam.ing.TP2.model.LyricsResponse;

public interface LyricsInterface {
    LyricsResponse buscarLetra(String artista, String cancion);
}