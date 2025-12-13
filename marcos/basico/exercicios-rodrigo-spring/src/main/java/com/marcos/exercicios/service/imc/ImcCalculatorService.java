package com.marcos.exercicios.service.imc;

public interface ImcCalculatorService {
    public void showCalculator();

    public void calculateImc(double weight, double height);

    public String diagnostic(double imcValue);
}
