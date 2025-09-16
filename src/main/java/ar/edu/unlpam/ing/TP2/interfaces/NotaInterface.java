package ar.edu.unlpam.ing.TP2.interfaces;

import java.util.ArrayList;

import ar.edu.unlpam.ing.TP2.model.Nota;

public interface NotaInterface {
    ArrayList<Nota> listar();
    void crear(Nota nota);
    void actualizar(String titulo, String contenido, int id);
    void eliminar(int id);
}