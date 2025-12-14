package com.kaillanny.estudos.exercicios.service.temperatura;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.kaillanny.estudos.exercicios.model.Temperatura;

@Service
public class TemperaturaImpl implements TemperaturaService {

    Scanner input = new Scanner(System.in);

    int temperaturaEmCelsius;

    Temperatura temperatura = new Temperatura(temperaturaEmCelsius);

    @Override
    public void converterTemperatura() {
        int opcao;
        do {
            System.out.println("""
            Você deseja converter CELSIUS para qual temperatura? 

                1. FAHRENHEIT;
                2. KELVIN;
                0. SAIR.

            """);
            opcao = input.nextInt();

            switch (opcao) {

                case 1 -> {
                    System.out.println("Você escolheu converter de CELSIUS para FAHRENHEIT");

                    System.out.println("Insira a temperatura em CELSIUS: ");
                    temperatura.setTemperatura(input.nextInt());
                    temperaturaEmCelsius = temperatura.getTemperatura();

                    int temperaturaEmFahrenheit = (temperaturaEmCelsius * 9 / 5) + 32;
                    System.out.printf("A temperatura %d C° convertida para Fahrenheit: %d\n", temperaturaEmCelsius, temperaturaEmFahrenheit);
                    break;
                }
                case 2 -> {
                    System.out.println("Você escolheu converter de CELSIUS para KELVIN");
                    
                    
                    System.out.println("Insira a temperatura em CELSIUS: ");
                    temperatura.setTemperatura(input.nextInt());
                    temperaturaEmCelsius = temperatura.getTemperatura();

                    double temperaturaEmKelvin = temperaturaEmCelsius + 273.15;
                    System.out.printf("A temperatura %d C° convertida para Kelvin: %.2f ", temperaturaEmCelsius, temperaturaEmKelvin);
                    break;
                }
                case 0 -> {
                    System.out.println("Você escolheu SAIR.");
                    break;
                } default -> System.out.println("Entrada inválida.");
            }
        } while (opcao != 0);
    }
}