package ar.edu.unlpam.ing.TP2.interfaces;

import ar.edu.unlpam.ing.TP2.model.HoraResponse;

public interface HorarioInterface {
    /**
     * Convierte la fecha/hora dada (formato ISO yyyy-MM-dd'T'HH:mm[:ss]) desde la zona origen a la zona destino.
     * @param fechaISO fecha en formato ISO (ej. 2025-08-28T20:00)
     * @param zonaOrigen id de zona (ej. America/Argentina/Buenos_Aires)
     * @param zonaDestino id de zona (ej. Europe/Madrid)
     * @return HoraResponse con los strings formateados
     * @throws Exception si la fecha o zonas son inválidas
     */
    HoraResponse convertir(String fechaISO, String zonaOrigen, String zonaDestino) throws Exception;
}