package com.marcos.exercicios.Desafio01;

public class ConversorCelsius {
    private int celsius;

    public ConversorCelsius(int celsius) {
        this.celsius = celsius;
    }

    public double converterFahrenheit() {
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

    public int converterKelvin() {
        int kelvin = celsius + 273;
        return kelvin;
    }

    public int getCelsius() {
        return celsius;
    }

}
