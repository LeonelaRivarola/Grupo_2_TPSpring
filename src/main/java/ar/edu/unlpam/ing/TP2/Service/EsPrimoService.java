package ar.edu.unlpam.ing.TP2.Service;

import org.springframework.stereotype.Service;

import ar.edu.unlpam.ing.TP2.interfaces.EsPrimoInterface;
import ar.edu.unlpam.ing.TP2.model.EsPrimo;

@Service
public class EsPrimoService implements EsPrimoInterface{

    @Override
    public EsPrimo esprimo(int num) {
        Boolean primo = true;

        if (num <= 1) {primo = false;}         // 0, 1 y negativos no son primos
        else if (num <= 3) {primo = true;}          // 2 y 3 son primos
        else if (num % 2 == 0 || num % 3 == 0) {primo = false;} // múltiplos de 2 o 3
        else {
            // prueba divisores de la forma 6k ± 1 hasta √n
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    primo = false;
                    break;
                }
            }
        }
        return new EsPrimo(num, primo);
    }
}