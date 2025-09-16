package ar.edu.unlpam.ing.TP2.interfaces;

import ar.edu.unlpam.ing.TP2.model.NumerosRequest;

public interface iEstadistica {
    double promedio(NumerosRequest request);
    int maximo(NumerosRequest request);
    int minimo(NumerosRequest request);
    int cantidad(NumerosRequest request);
}
