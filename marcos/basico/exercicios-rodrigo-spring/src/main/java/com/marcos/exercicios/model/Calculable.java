package com.marcos.exercicios.model;

import org.springframework.stereotype.Component;

@Component
public class Calculable {
    private int number;

    public Calculable(int number) {
        this.number = number;
    }

    public Calculable() {
    }

    public int getNumber() {
        return number;
    }
    
    
}
