package ar.edu.unlpam.ing.TP2.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ar.edu.unlpam.ing.TP2.interfaces.NotaInterface;
import ar.edu.unlpam.ing.TP2.model.Nota;

@Service
public class NotaService implements NotaInterface{
    private ArrayList<Nota> notas = new ArrayList<>();

    @Override
    public ArrayList<Nota> listar() {
        return notas;
    }

    @Override
    public void crear(Nota nota) {
        notas.add(nota);
    }

    @Override
    public void actualizar(String titulo, String contenido, int id) {
        for (Nota n : notas) {
            if (n.getId() == id) {
                if (titulo != null && !titulo.isEmpty()) {
                    n.setTitulo(titulo);
                }
                if (contenido != null && !contenido.isEmpty()) {
                    n.setContenido(contenido);
                }
            break;
            }
        }
    }


    @Override
    public void eliminar(int id) {
        notas.removeIf(n -> n.getId() == id);
    }
}