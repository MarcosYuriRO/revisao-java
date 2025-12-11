package com.marcos.exercicios.Desafio01;

import java.util.Scanner;

public class Main01 {
    public void showMain(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao Conversor de Temperatura.");
        int close = 0;

        while (close != 1) {

            System.out.print("Digite a temperatura em Celsius: ");
            int celsiusValue = scanner.nextInt();

            ConversorCelsius conversor = new ConversorCelsius(celsiusValue);

            System.out.println("""
                    Você gostaria de converter para:
                    1. Fahrenheit
                    2. Kelvin
                    """);

            int choice = scanner.nextInt();
            double result;

            switch (choice) {
                case 1:
                    result = conversor.converterFahrenheit();
                    System.out.printf("Esta temperatura, em Fahrenheit, equivale a: %.2f\n", result);
                    break;
                case 2:
                    result = conversor.converterKelvin();
                    System.out.printf("Esta temperatura, em Kelvin, equivale a: %.2f\n", result);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println("Caso queira encerrar o programa, digite 1. "
            + " Se não, digite qualquer outro número e continue a aplicação.");
            close = scanner.nextInt();
        }
        System.out.println("Programa encerrado!");
        scanner.close();
    }
}
