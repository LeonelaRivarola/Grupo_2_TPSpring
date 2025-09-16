package ar.edu.unlpam.ing.TP2.model;

public class EsPrimo {
    private int num;
    private Boolean primo;

    public EsPrimo(int num, Boolean primo) {
        this.num = num;
        this.primo = primo;
    }

    public int getNum() {
        return num;
    }

    public Boolean getPrimo() {
        return primo;
    }
}
