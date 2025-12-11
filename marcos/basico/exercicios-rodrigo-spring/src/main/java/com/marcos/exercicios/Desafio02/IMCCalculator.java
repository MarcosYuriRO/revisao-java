package com.marcos.exercicios.Desafio02;

public class IMCCalculator {
    private double weight;
    private double height;

    public IMCCalculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateIMC(double weight, double height) {
        double result = weight / (height * height);

        System.out.printf("Seu IMC é: %.2f\n", result);
        System.out.println("Diagnóstico: " + diagnostic(result));
    }

    public String diagnostic(double imcValue) {
        if (imcValue < 18.5) {
            return "Abaixo do peso";
        } else if (imcValue <= 24.9) {
            return "Peso normal";
        } else if (imcValue <= 29.9) {
            return "Sobrepeso";
        } else if (imcValue <= 34.9) {
            return "Obesidade grau I";
        } else if (imcValue <= 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}