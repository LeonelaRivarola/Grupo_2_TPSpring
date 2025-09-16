package ar.edu.unlpam.ing.TP2.model;

public class CelsiusAFarenheit {
    private float celsius;
    private float fahrenheit;

    public CelsiusAFarenheit(float celsius, float fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public float getCelsius() {
        return celsius;
    }

    public float getFahrenheit() {
        return fahrenheit;
    }
}