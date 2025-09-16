package ar.edu.unlpam.ing.TP2.Service;

import org.springframework.stereotype.Service;

import ar.edu.unlpam.ing.TP2.interfaces.InvertirInterface;
import ar.edu.unlpam.ing.TP2.model.Invertir;

@Service
public class InvertirService implements InvertirInterface {
    
    @Override
    public Invertir invertir(String original) {
        String invertido = new StringBuilder(original).reverse().toString();
        return new Invertir(original, invertido);
    }

}
