package ar.edu.unlpam.ing.TP2.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.stereotype.Service;

import ar.edu.unlpam.ing.TP2.interfaces.HorarioInterface;
import ar.edu.unlpam.ing.TP2.model.HoraResponse;

@Service
public class HorarioService implements HorarioInterface {

    @Override
    public HoraResponse convertir(String fechaISO, String zonaOrigen, String zonaDestino) {
        // Paso 1: parsear la fecha que viene en formato yyyy-MM-ddTHH:mm
        LocalDateTime fecha = LocalDateTime.parse(fechaISO);

        // Paso 2: crear la fecha en la zona de origen
        ZoneId origen = ZoneId.of(zonaOrigen);
        ZonedDateTime fechaOrigen = fecha.atZone(origen);

        // Paso 3: convertir a la zona destino
        ZoneId destino = ZoneId.of(zonaDestino);
        ZonedDateTime fechaDestino = fechaOrigen.withZoneSameInstant(destino);

        // Paso 4: devolver el resultado
        return new HoraResponse(
            fechaOrigen.toLocalDateTime().toString(),   // fecha original en string
            fechaDestino.toLocalDateTime().toString()   // fecha convertida en string
        );
    }
}