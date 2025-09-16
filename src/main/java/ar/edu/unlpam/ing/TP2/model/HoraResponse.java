package ar.edu.unlpam.ing.TP2.model;

public class HoraResponse {
    private String origen;
    private String destino;

    public HoraResponse() {}

    public HoraResponse(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}