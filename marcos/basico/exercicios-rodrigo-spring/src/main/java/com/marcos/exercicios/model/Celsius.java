package com.marcos.exercicios.model;

import org.springframework.stereotype.Component;

@Component
public class Celsius {
    int degreesCelsius;

    public Celsius(int degreesCelsius) {
        this.degreesCelsius = degreesCelsius;
    }

    public Celsius() {
    }



    public int getDegreesCelsius() {
        return degreesCelsius;
    }

    
    
}
