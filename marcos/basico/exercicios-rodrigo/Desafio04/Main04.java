package Desafio04;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DistanceConverter distanceConverter = new DistanceConverter();

        System.out.println("Conversor de Distância: ");
        int choice = -1;
        double valueToConvert;

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
                            valueToConvert = scanner.nextDouble();
                            System.out.println("Este valor, em centímetros, é: " + 
                            distanceConverter.metersToCentimeters(valueToConvert));
                            break;
                        case 2:
                            System.out.println("Digite o valor em centímetros: ");
                            valueToConvert = scanner.nextDouble();
                            System.out.println("Este valor, em metros, é: " + 
                            distanceConverter.centimeterToMeters(valueToConvert));
                            break;
                        case 3:
                            System.out.println("Digite o valor em quilômetros: ");
                            valueToConvert = scanner.nextDouble();
                            System.out.println("Este valor, em metros, é: " + 
                            distanceConverter.kilometersToMeters(valueToConvert));
                            break;
                        case 4:
                            System.out.println("Digite o valor em metros: ");
                            valueToConvert = scanner.nextDouble();
                            System.out.println("Este valor, em quilômetros, é: " + 
                            distanceConverter.metersToKilometers(valueToConvert));
                            break;
                        case 5:
                            System.out.println("Digite o valor em metros: ");
                            valueToConvert = scanner.nextDouble();
                            System.out.println("Este valor, em milhas, é: " + 
                            distanceConverter.metersToMiles(valueToConvert));

                            break;
                        default:
                            System.out.println("Opção Inválida!");
                            break;
                    }
                }
    }
}
