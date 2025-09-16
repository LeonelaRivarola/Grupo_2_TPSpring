package ar.edu.unlpam.ing.TP2.model;

public class Invertir {
    private String original;
    private String invertido;
    
    public Invertir(String original, String invertido) {
        this.original = original;
        this.invertido = invertido;
    }

    public String getOriginal() {
        return original;
    }

    public String getInvertido() {
        return invertido;
    }
}
