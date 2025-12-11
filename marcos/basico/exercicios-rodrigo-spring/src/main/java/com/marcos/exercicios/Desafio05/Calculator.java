package com.marcos.exercicios.Desafio05;

public class Calculator {
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

    public void calculateBissext(int year){
        if (year % 4 == 0) {
            System.out.println(year + " é um ano bissexto.");
        } else {
            System.out.println(year + " não é um ano bissexto.");
        }
    }
}
