package com.marcos.exercicios.service.distanceconverter;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.exercicios.model.DistanceUnit;

@Service
public class DistanceConverterImpl implements DistanceConverterService {
    @Autowired
    DistanceUnit distanceUnit;

    Scanner scanner = new Scanner(System.in);

    public void showConverter(){
        System.out.println("Conversor de Distância: ");
        int choice = -1;
        double distanceValue = 0;

        while(choice != 0){
            System.out.println("""
                    Digite a escolha que queira fazer, ou digite 0 para sair:
                    1 - metros para centímetros;
                    2 - centímetros para metros;
                    3 - quilômetros para metros;
                    4 - metros para quilômetros;
                    5 - metros para milhas.
                    """);
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 0:
                            System.out.println("Adeus!");
                            break;
                        case 1:
                            System.out.println("Digite o valor em metros: ");
                            distanceValue = scanner.nextDouble();
                            distanceUnit.setDistance(distanceValue);
                            System.out.println("Valor em centímetros: " + metersToCentimeters(distanceUnit.getDistance()));
                            break;
                        case 2:
                            System.out.println("Digite o valor em centímetros: ");
                            distanceValue = scanner.nextDouble();
                            distanceUnit.setDistance(distanceValue);
                            System.out.println("Valor em metros: " + centimeterToMeters(distanceUnit.getDistance()));
                            break;
                        case 3:
                            System.out.println("Digite o valor em quilômetros: ");
                            distanceValue = scanner.nextDouble();
                            distanceUnit.setDistance(distanceValue);
                            System.out.println("Valor em metros: " + kilometersToMeters(distanceUnit.getDistance()));
                            break;
                        case 4:
                            System.out.println("Digite o valor em metros: ");
                            distanceValue = scanner.nextDouble();
                            distanceUnit.setDistance(distanceValue);
                            System.out.println("Valor em quilômetros: " + metersToKilometers(distanceUnit.getDistance()));
                            break;
                        case 5:
                            System.out.println("Digite o valor em metros: ");
                            distanceValue = scanner.nextDouble();
                            distanceUnit.setDistance(distanceValue);
                            System.out.println("Valor em milhas: " + metersToMiles(distanceUnit.getDistance()));
                            break;
                        default:
                            System.out.println("Opção Inválida!");
                            break;
                    }
                }

    }

    public double metersToCentimeters(double meters){
        double centimetersConverted = meters * 100;
        return centimetersConverted;
    }

    public double centimeterToMeters(double centimeters){
        double metersConverted = centimeters / 100;
        return metersConverted;
    }

    public double kilometersToMeters(double kilometers){
        double metersConverted = kilometers * 1000;
        return metersConverted;
    }

    public double metersToKilometers (double meters){
        double kilometersConverted = meters / 1000;
        return kilometersConverted;
    }

    public double metersToMiles(double meters){
        double milesConverted = meters / 1600;
        return milesConverted;
    }
}
