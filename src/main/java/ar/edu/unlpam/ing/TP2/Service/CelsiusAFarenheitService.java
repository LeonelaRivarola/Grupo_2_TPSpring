package ar.edu.unlpam.ing.TP2.Service;

import org.springframework.stereotype.Service;
import ar.edu.unlpam.ing.TP2.interfaces.ICelsiusAFarenheit;
import ar.edu.unlpam.ing.TP2.model.CelsiusAFarenheit;

@Service
public class CelsiusAFarenheitService implements ICelsiusAFarenheit {
    @Override
    public CelsiusAFarenheit convertir(float celsius) {
        float fahrenheit = (celsius * 9 / 5) + 32;
        return new CelsiusAFarenheit(celsius, fahrenheit);
    }
}