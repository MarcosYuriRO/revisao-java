package com.marcos.exercicios.model;

import org.springframework.stereotype.Component;

@Component
public class Imc {
    private double weight;
    private double height;
    
    public Imc(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public Imc() {
    }



    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    
    
}
