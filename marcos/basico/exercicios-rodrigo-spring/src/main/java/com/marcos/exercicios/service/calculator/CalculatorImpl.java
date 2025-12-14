package com.marcos.exercicios.service.calculator;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.exercicios.model.Calculable;

@Service
public class CalculatorImpl implements CalculatorService {
    @Autowired
    Calculable number;

    Scanner scanner = new Scanner(System.in);

    public void showCalculator(){
         System.out.println("Validador de Dados");
        int choice = -1;
        int chosenNumber;

        while (choice != 0) {

            System.out.println("""
                    O que você quer verificar?

                    1. Verificar Par ou Ímpar;
                    2. Verificar Positivo, Negativo ou 0;
                    3. Verificar Ano Bissexto;
                    0. Sair da Aplicação.
                    """);

            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Digite um número inteiro: ");
                    chosenNumber = scanner.nextInt();
                    number = new Calculable(chosenNumber);
                    calculateEvenOrOdd(number.getNumber());
                    break;
                case 2:
                    System.out.println("Digite um número inteiro: ");
                    chosenNumber = scanner.nextInt();
                    number = new Calculable(chosenNumber);
                    calculatePositivity(number.getNumber());
                    break;
                case 3:
                    System.out.println("Digite um ano: ");
                    chosenNumber = scanner.nextInt();
                    number = new Calculable(chosenNumber);
                    calculateLeapYear(number.getNumber());
                    break;
                case 0:
                    System.out.println("Adeus!");
                    break;
            
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        }

    }

    public void calculateEvenOrOdd(int number){
        if (number % 2 == 0) {
            System.out.println(number + " é um número par.");
        } else {
            System.out.println(number + " é um número ímpar.");
        }
    }

    public void calculatePositivity(int number){
        if (number > 0) {
            System.out.println(number + " é um número positivo.");
        } else if (number < 0){
            System.out.println(number + " é um número negativo.");
        } else {
            System.out.println("Seu número equivale a zero.");
        }
    }

    public void calculateLeapYear(int year){
        if (year % 4 == 0) {
            System.out.println(year + " é um ano bissexto.");
        } else {
            System.out.println(year + " não é um ano bissexto.");
        }
    }
}
