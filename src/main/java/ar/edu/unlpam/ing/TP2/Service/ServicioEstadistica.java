package ar.edu.unlpam.ing.TP2.Service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unlpam.ing.TP2.interfaces.iEstadistica;
import ar.edu.unlpam.ing.TP2.model.NumerosRequest;

@Service
public class ServicioEstadistica implements iEstadistica{

    @Override
    public double promedio(NumerosRequest request) {
        List<Integer> numeros = request.getNumeros();
        double promedio = 0;

        if (numeros == null || numeros.isEmpty()) {
            return promedio;
        }
        else{
            return promedio = numeros.stream().mapToInt(Integer::intValue).average().orElse(0); //calcula el promedio
        }
    }

    @Override
    public int maximo(NumerosRequest request) {
        List<Integer> numeros = request.getNumeros();
        if (numeros == null || numeros.isEmpty()) {
            return 0;
        }
        else{
            return Collections.max(numeros);
        }
    }

    @Override
    public int minimo(NumerosRequest request) {
        List<Integer> numeros = request.getNumeros();
        if (numeros == null || numeros.isEmpty()) {
            return 0;
        }
        else{
            return Collections.min(numeros);
        }
    }

    @Override
    public int cantidad(NumerosRequest request) {
        List<Integer> numeros = request.getNumeros();
        if (numeros == null || numeros.isEmpty()) {
            return 0;
        }
        else{
            return numeros.size();
        }
    }
    
}
