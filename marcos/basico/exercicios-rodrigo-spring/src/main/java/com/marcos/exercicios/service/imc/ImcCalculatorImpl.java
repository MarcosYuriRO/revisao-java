package com.marcos.exercicios.service.imc;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.exercicios.model.Imc;

@Service
public class ImcCalculatorImpl {
    @Autowired
    Imc imc;

    Scanner scanner = new Scanner(System.in);

    public void showCalculator(){
        System.out.println("Calculadora de IMC");
        System.out.println("Digite seu peso em kg:");
        double weightValue = scanner.nextDouble();
        System.out.println("Digite sua altura em metros:");
        double heightValue = scanner.nextDouble();

        imc = new Imc(weightValue, heightValue);

        calculateImc();
    }

    public void calculateImc(){
        double result = imc.getWeight() / (imc.getHeight() * imc.getHeight());

        System.out.printf("Seu IMC é: %.2f\n", result);
        System.out.println("Diagnóstico: " + diagnostic(result));
    }

    public String diagnostic(double imcValue){
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
