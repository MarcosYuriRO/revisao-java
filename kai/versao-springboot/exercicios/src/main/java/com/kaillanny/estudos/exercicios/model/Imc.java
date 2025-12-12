package com.kaillanny.estudos.exercicios.model;

import org.springframework.stereotype.Component;

@Component
public class Imc {
    protected int peso;
    protected double altura;

    public Imc(int peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}
