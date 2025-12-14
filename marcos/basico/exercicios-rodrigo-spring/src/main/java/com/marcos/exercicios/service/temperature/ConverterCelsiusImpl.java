package com.marcos.exercicios.service.temperature;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.exercicios.model.Celsius;

@Service
public class ConverterCelsiusImpl implements ConverterCelsiusService{
    @Autowired
    Celsius celsius;

    Scanner scanner = new Scanner(System.in);

    @Override
    public void converterMenu(){
        int close = 0;

        while (close != 1) {
        System.out.print("Digite a temperatura em Celsius: ");
            int celsiusValue = scanner.nextInt();

            celsius = new Celsius(celsiusValue);

            System.out.println("""
                    Você gostaria de converter para:
                    1. Fahrenheit
                    2. Kelvin
                    """);

            int choice = scanner.nextInt();
            double result;

            switch (choice) {
                case 1:
                    result = fahrenheitConverter();
                    System.out.printf("Esta temperatura, em Fahrenheit, equivale a: %.2f\n", result);
                    break;
                case 2:
                    result = kelvinConverter();
                    System.out.println("Esta temperatura, em Kelvin, equivale a: " + result);
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


    @Override
    public double fahrenheitConverter(){
        double fahrenheit = celsius.getDegreesCelsius() * 1.8 + 32;
        return fahrenheit;
    }

    @Override
    public int kelvinConverter(){
       int kelvin = celsius.getDegreesCelsius() + 273;
        return kelvin;
    }
}
